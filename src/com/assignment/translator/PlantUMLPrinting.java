package com.assignment.translator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;

import com.assignment.IR.ClassInfo;
import com.assignment.IR.Globals;
import com.assignment.IR.InterfaceInfo;
import com.assignment.IR.InterfaceUses;
import com.assignment.IR.MethodInfo;
import com.assignment.IR.VariableInfo;

import net.sourceforge.plantuml.SourceStringReader;

public class PlantUMLPrinting {
		
	public static void printPlantUML(String outputFileName) throws IOException {
		
		StringBuffer plantUMLFormat = new StringBuffer();
		OutputStream png = new FileOutputStream(outputFileName + "_plantUML.png");		
		
		//Appending headers
		plantUMLFormat.append("@startuml\nskinparam classAttributeIconSize 0\n");		
		printClasses(plantUMLFormat);
		printInterfaces(plantUMLFormat);
		
		//Appening footers
		plantUMLFormat.append("@enduml\n");	
		
		SourceStringReader reader = new SourceStringReader(plantUMLFormat.toString());
		//System.out.println(plantUMLFormat.toString());
		// Write the first image to "png"
		try {
			String desc = reader.generateImage(png);
		}
		catch(IOException ex) {
			System.out.println("There was an issue generating plant UML image. Make sure u have installed graphviz.");
		}
	}
	
	public static void printClasses(StringBuffer plantUMLFormat) {
		
		for (ClassInfo classInfo : Globals.classList.values()) {
			plantUMLFormat.append("\n");
			plantUMLFormat.append("class " + classInfo.getName() + "{");

			// printing variables
			for (VariableInfo varInfo : classInfo.getVariableList()) {
				plantUMLFormat.append("\n\t");
				
				if (varInfo.getVarVisibility() != null && !varInfo.getVarVisibility().trim().isEmpty() && varInfo.isPrimitive()) {
					switch (varInfo.getVarVisibility().trim()) {
					case "public":
						plantUMLFormat.append("+");
						break;
					case "private":
						plantUMLFormat.append("-");
						break;
					case "protected":
						plantUMLFormat.append("#");
						break;
					case "":
						plantUMLFormat.append("#");
						break;
					}
					
					plantUMLFormat.append(varInfo.getName());					
					plantUMLFormat.append(":");
					plantUMLFormat.append(varInfo.getDataType());
				} else if(varInfo.isPrimitive() && (varInfo.getVarVisibility() == null || varInfo.getVarVisibility().trim().isEmpty())){
					//System.out.println("varInfo"+ varInfo.getName());
					plantUMLFormat.append("#");
					plantUMLFormat.append(varInfo.getName());					
					plantUMLFormat.append(":");
					plantUMLFormat.append(varInfo.getDataType());
					
				}			
			}
			plantUMLFormat.append("\n");

			// printing methods
			for (MethodInfo methodInfo : classInfo.getMethodList()) {
				if(methodInfo.isGetterSetter()) continue;
				boolean isStatic = false;
								
				plantUMLFormat.append("\t");	
				if (methodInfo.getMethodVisibilty().trim().contains("static")) {
					String[] temp = methodInfo.getMethodVisibilty().trim().split("\\s+");
					if(temp.length==2) {
						if(Globals.accessSpecifiers.contains(temp[0]))
							methodInfo.setMethodVisibilty(temp[0]);							
					}
					isStatic = true;	

				}

				if(isStatic)
					plantUMLFormat.append("~~");
				switch (methodInfo.getMethodVisibilty().trim()) {
				case "public":
					plantUMLFormat.append("+");
					break;
				case "private":
					plantUMLFormat.append("-");
					break;
				case "protected":
					plantUMLFormat.append("#");
					break;
				case "":
					plantUMLFormat.append("#");
					break;
				
				}
			
				
				plantUMLFormat.append(methodInfo.getName());
				plantUMLFormat.append("(");
				
				int varCount = methodInfo.getParameterList().size();
				for(VariableInfo var:methodInfo.getParameterList()) {
					
					plantUMLFormat.append(var.getName());
					plantUMLFormat.append(":");
					plantUMLFormat.append(var.getDataType());
					if(varCount>1)
						plantUMLFormat.append(",");
					varCount--;
				}

				plantUMLFormat.append(")");
				if(isStatic)
					plantUMLFormat.append("~~");
				
				if(!methodInfo.getReturnType().equals("constructor"))
				{
					plantUMLFormat.append(":");
					plantUMLFormat.append(methodInfo.getReturnType());
				}
			}
			

			plantUMLFormat.append("\n");
			plantUMLFormat.append("}");
			plantUMLFormat.append("\n");
		}

		// Printing all the arrows at the last
		for (String key : Globals.arrowMappings.keySet()) {
			String srcTarget[] = key.split("=\\>");
			String assoc = srcTarget[0] + " " + Globals.arrowMappings.get(key).getSrcCardinality() + " - "
					+ Globals.arrowMappings.get(key).getTargetCardinality() + " " + srcTarget[1] + "\n";
			// System.out.println(assoc);
			plantUMLFormat.append(assoc);
		}
		
		for(InterfaceUses uses:Globals.interfaceUses.values()) {
			plantUMLFormat.append(uses.getClassName());
			plantUMLFormat.append("  \"uses\"..> ");
			plantUMLFormat.append(uses.getInterfaceName() + "\n");
			
		}

		for (ClassInfo classInfo : Globals.classList.values()) {
		
			plantUMLFormat.append("\n");
			// printing extends relationship
			if (!classInfo.getParentName().equals("")) {
				plantUMLFormat.append(classInfo.getParentName());
				plantUMLFormat.append("<|-- ");
				plantUMLFormat.append(classInfo.getName());
			}
			plantUMLFormat.append("\n");
			//printing implements relationship
			if (classInfo.getInterfaceList().size() > 0) {				
				for(String interfaceName : classInfo.getInterfaceList()) {
					plantUMLFormat.append(interfaceName);
					plantUMLFormat.append("<|.. ");
					plantUMLFormat.append(classInfo.getName());
					plantUMLFormat.append("\n");					
				}			
			}
			
		}		
	}
	
	public static void printInterfaces(StringBuffer plantUMLFormat) {
	
		for(InterfaceInfo interfaceInfo : Globals.interfacesList.values()) {
			plantUMLFormat.append("\n");
			plantUMLFormat.append("interface ");			
			plantUMLFormat.append(interfaceInfo.getName());
			plantUMLFormat.append("<<interface>>");
			plantUMLFormat.append("{\n");
			
			for (VariableInfo varInfo : interfaceInfo.getVariableList()) {
				plantUMLFormat.append("\n\t");
				if (varInfo.getVarVisibility() != null) {
					switch (varInfo.getVarVisibility()) {
					case "public":
						plantUMLFormat.append("+");
						break;
					case "private":
						plantUMLFormat.append("-");
						break;
					case "protected":
						plantUMLFormat.append("#");
						break;
					case "":
						plantUMLFormat.append("#");
						break;
					}
				}
				// Is primitive datatype
				plantUMLFormat.append(varInfo.getName());
				plantUMLFormat.append(":");
				plantUMLFormat.append(varInfo.getDataType());
			}			
	
			for(MethodInfo methodInfo:interfaceInfo.getMethodList()) {
				plantUMLFormat.append("\t");			
				if(methodInfo.getMethodVisibilty()!=null){
					//System.out.println(interfaceInfo.getName() + "::" +methodInfo.getName()  + "::"+ methodInfo.getMethodVisibilty().trim());
					switch (methodInfo.getMethodVisibilty().trim()) {
					case "public":
						plantUMLFormat.append("+");
						break;
					case "private":
						plantUMLFormat.append("-");
						break;
					case "protected":
						plantUMLFormat.append("#");
						break;
					case "public abstract" :
						plantUMLFormat.append("+");
						break;
					case "":
						plantUMLFormat.append("#");
						break;
					}
				}
				plantUMLFormat.append(methodInfo.getName());
				plantUMLFormat.append("(");
				
				int varCount = methodInfo.getParameterList().size();
				for(VariableInfo var:methodInfo.getParameterList()) {					
					plantUMLFormat.append(var.getName());
					plantUMLFormat.append(":");
					plantUMLFormat.append(var.getDataType());
					if(varCount>1)
						plantUMLFormat.append(",");
					varCount--;
				}
				plantUMLFormat.append(")");
				if(!methodInfo.getReturnType().equals("constructor"))
				{
					plantUMLFormat.append(":");
					plantUMLFormat.append(methodInfo.getReturnType());
				}			
			}	
			
			//end of interface
			plantUMLFormat.append("\n}\n");			
			for (InterfaceInfo interfaces : Globals.interfacesList.values()) {				
				plantUMLFormat.append("\n");
				//printing implements relationship
				if (interfaces.getParentList().size() > 0) {
					for (String interfaceName : interfaces.getParentList()) {
						plantUMLFormat.append(interfaceName);
						plantUMLFormat.append("<|.. ");
						plantUMLFormat.append(interfaces.getName());
						plantUMLFormat.append("\n");
					}
				}
				
			}
			
			for(String className : Globals.localVarAssocs.keySet()) {			
				plantUMLFormat.append(className);
				plantUMLFormat.append("..>");								
				plantUMLFormat.append(Globals.localVarAssocs.get(className));
				plantUMLFormat.append("\n");				
			}
		}
	}
}
