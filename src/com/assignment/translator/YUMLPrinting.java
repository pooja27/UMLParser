package com.assignment.translator;

import java.io.IOException;

import com.assignment.IR.ClassInfo;
import com.assignment.IR.Globals;
import com.assignment.IR.InterfaceInfo;
import com.assignment.IR.InterfaceUses;
import com.assignment.IR.MethodInfo;
import com.assignment.IR.VariableInfo;

public class YUMLPrinting {

	// System.out.println();

	private static StringBuffer yUMLFormat = new StringBuffer();

	public static void printyUMLFormat(String outputFileName) throws IOException {
		print_yUMLClasses();
		print_yUMLInterfaces();
		
		//System.out.println(yUMLFormat.toString());
		String output_yUMLTextFile = outputFileName + ".txt";
		yUML.createDiag(yUMLFormat.toString(), outputFileName + "_yUML", "png");
		yUML.createDiag(yUMLFormat.toString(), outputFileName + "_yUML", "pdf");
	}

	// Printing Interface Information
	public static void print_yUMLInterfaces() {
		for (InterfaceInfo interfaceInfo : Globals.interfacesList.values()) {
			yUMLFormat.append("[");
			yUMLFormat.append("<<interface>>;");
			yUMLFormat.append(interfaceInfo.getName());	
			yUMLFormat.append("],");			
		}
	}

	// Printing Class Information
	public static void print_yUMLClasses() {
		// Example::
		// [User|+Forename+;Surname;+HashedPassword;-Salt|+Login();+Logout()]

		int count = 0;
		for (ClassInfo classInfo : Globals.classList.values()) {
			count = 0;
			yUMLFormat.append("[");			
			yUMLFormat.append(classInfo.getName());
				if(classInfo.getVariableList().size()>0)
					yUMLFormat.append("|");
			for (VariableInfo varInfo : classInfo.getVariableList()) {
				//yUMLFormat.append("t");

				if (varInfo.getVarVisibility() != null && !varInfo.getVarVisibility().trim().isEmpty()
						&& varInfo.isPrimitive()) {
					switch (varInfo.getVarVisibility().trim()) {
					case "public":
						yUMLFormat.append("+");
						break;
					case "private":
						yUMLFormat.append("-");
						break;
					case "protected":
						yUMLFormat.append("#");
						break;
					}

					yUMLFormat.append(varInfo.getName());
					yUMLFormat.append(":");
					yUMLFormat.append(varInfo.getDataType());
				} else if (varInfo.isPrimitive()
						&& (varInfo.getVarVisibility() == null || varInfo.getVarVisibility().trim().isEmpty())) {
					yUMLFormat.append("#");
					yUMLFormat.append(varInfo.getName());
					yUMLFormat.append(":");
					yUMLFormat.append(varInfo.getDataType());

				}
				yUMLFormat.append(";");
			}

			// Variable Separator
			if(classInfo.getMethodList().size()>0)
			{
				if(classInfo.getVariableList().size()==0)
					yUMLFormat.append("|");
				yUMLFormat.append("|");
			}
						
			for (MethodInfo methodInfo : classInfo.getMethodList()) {
				if (methodInfo.isGetterSetter())
					continue;
				boolean isStatic = false;

				//yUMLFormat.append("\t");
				if (methodInfo.getMethodVisibilty().trim().contains("static")) {
					String[] temp = methodInfo.getMethodVisibilty().trim().split("\\s+");
					if (temp.length == 2) {
						if (Globals.accessSpecifiers.contains(temp[0]))
							methodInfo.setMethodVisibilty(temp[0]);
					}
					isStatic = true;

				}

				/*if (isStatic)
					yUMLFormat.append("~~");*/
				switch (methodInfo.getMethodVisibilty().trim()) {
				case "public":
					yUMLFormat.append("+");
					break;
				case "private":
					yUMLFormat.append("-");
					break;
				case "protected":
					yUMLFormat.append("#");
					break;
				}

				yUMLFormat.append(methodInfo.getName());
				yUMLFormat.append("(");

				int varCount = methodInfo.getParameterList().size();
				for (VariableInfo var : methodInfo.getParameterList()) {

					yUMLFormat.append(var.getName());
					yUMLFormat.append(":");
					yUMLFormat.append(var.getDataType());
					if (varCount > 1)
						yUMLFormat.append(";");
					varCount--;
				}

				yUMLFormat.append(")");
				/*if (isStatic)
					yUMLFormat.append("~~");*/

				if (!methodInfo.getReturnType().equals("constructor")) {
					yUMLFormat.append(":");
					yUMLFormat.append(methodInfo.getReturnType());
				}
				
				if(count++ < classInfo.getMethodList().size()-1) {
					yUMLFormat.append(";");										
				}				
			}		
			
			yUMLFormat.append("],");
			
		}
		
		
		// Printing all the arrows at the last
		for (String key : Globals.arrowMappings.keySet()) {
			String srcTarget[] = key.split("=\\>");
			
			if(Globals.interfacesList.containsKey(srcTarget[0])) 
				srcTarget[0] = "<<interface>>;" + srcTarget[0];
			if(Globals.interfacesList.containsKey(srcTarget[1])) 
				srcTarget[1] = "<<interface>>;" + srcTarget[1];
			String srcCard = Globals.arrowMappings.get(key).getSrcCardinality().replaceAll("\"", "");
			String targetCard = Globals.arrowMappings.get(key).getTargetCardinality().replaceAll("\"", "");
			String assoc = "[" + srcTarget[0] + "] " + srcCard + "-"
					+ targetCard + " [" + srcTarget[1] + "],";
			//System.out.println(assoc);
			yUMLFormat.append(assoc);
		}
		
		for(InterfaceUses uses:Globals.interfaceUses.values()) {
			yUMLFormat.append("[" + uses.getClassName() + "]uses");
			yUMLFormat.append("-.->");
			yUMLFormat.append("[<<interface>>;"+uses.getInterfaceName() + "]\n");			
		}

		for (ClassInfo classInfo : Globals.classList.values()) {		
			yUMLFormat.append("\n");
			// printing extends relationship
			if (!classInfo.getParentName().equals("")) {
				yUMLFormat.append("[" + classInfo.getParentName() + "]");
				yUMLFormat.append("^-");
				yUMLFormat.append("[" + classInfo.getName() + "]");
				
			}
			yUMLFormat.append("\n");
			//printing implements relationship
			if (classInfo.getInterfaceList().size() > 0) {				
				for(String interfaceName : classInfo.getInterfaceList()) {
					yUMLFormat.append("[<<interface>>;" + interfaceName + "]");
					yUMLFormat.append("^-.-");
					yUMLFormat.append("["+classInfo.getName() + "]");
					yUMLFormat.append("\n");					
				}			
			}
			
		}		
		
		for(String className : Globals.localVarAssocs.keySet()){
			yUMLFormat.append("[" );
			if(Globals.interfacesList.containsKey(className))
				yUMLFormat.append("<<interface>>;");
			yUMLFormat.append(className + "]");
			yUMLFormat.append("-.->");
			
			yUMLFormat.append("[" );
			if(Globals.interfacesList.containsKey(Globals.localVarAssocs.get(className)))
				yUMLFormat.append("<<interface>>;");
			yUMLFormat.append(Globals.localVarAssocs.get(className) + "]");
			
		}
		
	}

}
