package com.assignment.translator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import com.assignment.IR.Cardinality;
import com.assignment.IR.ClassInfo;
import com.assignment.IR.Globals;
import com.assignment.IR.InterfaceUses;
import com.assignment.IR.MethodInfo;
import com.assignment.IR.VariableInfo;

public class BuildSmartGraph {

	public static void buildSmartGraph() {	
		getImplementsInformation();
		extractFromVariables();
		extractFromMethods();
		optimizeGetterSetters();
		getFromMethodBodies();		
	}
	
	private static void getFromMethodBodies() {
		for (ClassInfo classInfo : Globals.classList.values()) {				
			for(MethodInfo methodInfo : classInfo.getMethodList()) {
				if(methodInfo.getLocalParameterList().size()>0) {
					for(VariableInfo var : methodInfo.getLocalParameterList()) {
						if(Globals.classList.containsKey(var.getDataType())) {
							Globals.localVarAssocs.put(classInfo.getName(), var.getDataType());
							continue;
						} 
						if(Globals.interfacesList.containsKey(var.getDataType())) {
							Globals.localVarAssocs.put(classInfo.getName(), var.getDataType());							
						}
					}
				}
			}
		}			
	}

	public static void optimizeGetterSetters() {
		
		HashSet<String> varNames = new HashSet<>();
		HashSet<String> getterSetterNames = new HashSet<>();
		HashMap<String,Integer> getterSetter = new HashMap<>();
		
		for (ClassInfo classInfo : Globals.classList.values()) {		
			for (VariableInfo varInfo : classInfo.getVariableList()) {
				//String varName = Character.toString(varInfo.getName().charAt(0)).toUpperCase()+varInfo.getName().substring(1);
				varNames.add(varInfo.getName());			
			}
			
			for (MethodInfo methodInfo : classInfo.getMethodList()) {
				// check if the method is a getter setter
				if (methodInfo.getName().startsWith("get")) {
					String[] var = methodInfo.getName().split("^get");
					String varName = Character.toString(var[1].charAt(0)).toLowerCase()+var[1].substring(1);
					if (varNames.contains(varName)) {						
						if(getterSetter.containsKey(varName)) {							
							methodInfo.setGetterSetter(true);
							getterSetterNames.add(methodInfo.getName());
							getterSetterNames.add("set" + var[1]);
							getterSetter.put(varName, new Integer(2));
						}
						else
							getterSetter.put(varName, new Integer(1));
					}
				} else if (methodInfo.getName().startsWith("set")) {
					String[] var = methodInfo.getName().split("^set");
					String varName = Character.toString(var[1].charAt(0)).toLowerCase()+var[1].substring(1);
					if (varNames.contains(varName)) {						
						if(getterSetter.containsKey(varName)) {
							methodInfo.setGetterSetter(true);
							getterSetterNames.add(methodInfo.getName());
							getterSetterNames.add("get" + var[1]);
							getterSetter.put(varName, new Integer(2));
						}
						else
							getterSetter.put(varName, new Integer(1));						
					}
				}
			}			
			
			for (MethodInfo methodInfo : classInfo.getMethodList()) {
				if(getterSetterNames.contains(methodInfo.getName())) {
					methodInfo.setGetterSetter(true);					
				}
			}
		}	
		
		//Changing getter setter members		
		for (ClassInfo classInfo : Globals.classList.values()) {			
			for (VariableInfo varInfo : classInfo.getVariableList()) {
				if(getterSetter.containsKey(varInfo.getName())) {
					varInfo.setVarVisibility("public");
				}
			}		
		}
		
	}

	public static void extractFromVariables() {

		for (ClassInfo classInfo : Globals.classList.values()) {
			
			for (VariableInfo varInfo : classInfo.getVariableList()) {
				if (Globals.primitiveHash.contains(varInfo.getDataType())) {
					varInfo.setPrimitive(true);
					varInfo.setCollection(false);
				} else {
					// Is a collection
					varInfo.setName(varInfo.getName().replaceAll(" ", ""));
					
					if (varInfo.getDataType().contains("[")) {

						String vars[] = varInfo.getDataType().split("\\[");
						if (vars.length == 2) {
							
							if (Globals.primitiveHash.contains(vars[0])) {
								varInfo.setPrimitive(true);
								varInfo.setCollection(true);
							} else if(!Globals.interfacesList.containsKey(vars[0]) && !Globals.classList.containsKey(vars[0])) {								
								varInfo.setPrimitive(true);
								varInfo.setCollection(true);
							} else {
								varInfo.setPrimitive(false);
								varInfo.setCollection(true);
								
								varInfo.setDataType(varInfo.getDataType().replaceAll("\\[", " "));
								varInfo.setDataType(varInfo.getDataType().replaceAll("\\]", " "));

								String src = classInfo.getName();
								String target = varInfo.getDataType();

								String key = src + "=>" + target;

								// Reverse and check if present
								String searchKey = varInfo.getDataType() + "=>" + classInfo.getName();

								if (Globals.arrowMappings.containsKey(searchKey)) {
									Globals.arrowMappings.get(searchKey).setSrcCardinality("\"*\"");
								} else {
									Globals.arrowMappings.put(key, new Cardinality("\" \"", "\"*\""));
								}
							}
						}
					} else if (varInfo.getDataType().contains("<")) {
						varInfo.setPrimitive(false);
						varInfo.setCollection(true);

						String vars[] = varInfo.getDataType().split("\\<");

						if (vars.length == 2) {

							String tempVar = vars[1].replaceAll("\\>", "");
							
							if(!Globals.interfacesList.containsKey(tempVar) && !Globals.classList.containsKey(tempVar)) {								
								varInfo.setPrimitive(true);
								varInfo.setCollection(true);
								continue;
							} 
							varInfo.setDataType(vars[1].replaceAll("\\>", ""));
							
							String src = classInfo.getName();
							String target = varInfo.getDataType();

							String key = src + "=>" + target;

							// Reverse and check if present
							String searchKey = varInfo.getDataType() + "=>" + classInfo.getName();

							if (Globals.arrowMappings.containsKey(searchKey)) {
								Globals.arrowMappings.get(searchKey).setSrcCardinality("\"*\"");
							} else {
								Globals.arrowMappings.put(key, new Cardinality("\" \"", "\"*\""));
							}
						}
					} else if (Globals.interfacesList.containsKey(varInfo.getDataType())) {
						varInfo.setPrimitive(false);
						varInfo.setCollection(false);

						String src = classInfo.getName();
						String target = varInfo.getDataType();

						String key = src + "=>" + target;

						// Reverse and check if present
						String searchKey = varInfo.getDataType() + "=>" + classInfo.getName();

						if (Globals.arrowMappings.containsKey(searchKey)) {
							Globals.arrowMappings.get(searchKey).setSrcCardinality("\"1\"");
						} else {
							Globals.arrowMappings.put(key, new Cardinality("\" \"", "\"1\""));
						}
					} else if (Globals.classList.containsKey(varInfo.getDataType())) {
						varInfo.setPrimitive(false);
						varInfo.setCollection(false);
						String src = classInfo.getName();
						String target = varInfo.getDataType();

						String key = src + "=>" + target;

						// Reverse and check if present
						String searchKey = varInfo.getDataType() + "=>" + classInfo.getName();

						if (Globals.arrowMappings.containsKey(searchKey)) {
							Globals.arrowMappings.get(searchKey).setSrcCardinality("\"1\"");
						} else {
							Globals.arrowMappings.put(key, new Cardinality("\" \"", "\"1\""));
						}
					}
				}
			}
		}

	}
	
	public static void extractFromMethods() {
		
		for (ClassInfo classInfo : Globals.classList.values()) {
			
			for (MethodInfo methodInfo : classInfo.getMethodList()) {
				
				for (VariableInfo varInfo : methodInfo.getParameterList()) {
			
					if (Globals.primitiveHash.contains(varInfo.getDataType())) {
						varInfo.setPrimitive(true);
						varInfo.setCollection(false);

					} else {
						// Is a collection
						varInfo.setName(varInfo.getName().replaceAll(" ", ""));
						if (varInfo.getDataType().contains("[")) {
							String vars[] = varInfo.getDataType().split("\\[");
							if (vars.length == 2) {
								if (Globals.primitiveHash.contains(vars[0])) {
									varInfo.setPrimitive(true);
									varInfo.setCollection(true);

								} else {
									varInfo.setPrimitive(false);
									varInfo.setCollection(true);

									if (Globals.interfacesList.containsKey(vars[0].replaceAll("]", ""))) {
										//InterfaceUses(classInfo.getName(), vars[0].replaceAll("]", "")
										String temp = (classInfo.getName()+"=>"+ vars[0].replaceAll("]", ""));										
										Globals.interfaceUses.put(temp, new InterfaceUses(classInfo.getName(), temp));
									}

								}
							}
						} else if (varInfo.getDataType().contains("<")) {
							
							varInfo.setPrimitive(false);
							varInfo.setCollection(true);

							String vars[] = varInfo.getDataType().split("\\<");

							if (vars.length == 2) {

								if (Globals.interfacesList.containsKey(vars[1].replaceAll(">", ""))) {
									String temp = (classInfo.getName()+"=>"+ vars[0].replaceAll(">", ""));										
									Globals.interfaceUses.put(temp, new InterfaceUses(classInfo.getName(), temp));
								}

							}
						
						} else if (Globals.interfacesList.containsKey(varInfo.getDataType())) {
							
							varInfo.setPrimitive(false);
							varInfo.setCollection(false);
							if (Globals.interfacesList.containsKey(varInfo.getDataType())) {
								String temp = classInfo.getName() + "=>" +varInfo.getDataType();
								Globals.interfaceUses.put(temp,new InterfaceUses(classInfo.getName(), varInfo.getDataType()));
							}
						}
					}
				}
			}
		}
	}

	public static void getImplementsInformation() {
		for (ClassInfo classInfo : Globals.classList.values()) {
			for(String interfaceVar : classInfo.getInterfaceList()) {
				if(Globals.interfacesList.containsKey(interfaceVar)){
					if(Globals.interfacesList.get(interfaceVar).getImplementedBy()!=null)
						Globals.interfacesList.get(interfaceVar).getImplementedBy().add(interfaceVar);
					else {
						ArrayList<String> temp = new ArrayList();
						temp.add(interfaceVar);
						Globals.interfacesList.get(interfaceVar).setImplementedBy(temp);
					}
				}					
			}
		}
		
		//System.out.println("Here");
	}
}
