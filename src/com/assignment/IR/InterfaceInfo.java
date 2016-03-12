package com.assignment.IR;

import java.util.ArrayList;

public class InterfaceInfo {

	private String name;	
	private String classVisibility;
	
	private ArrayList<VariableInfo> variableList;
	private ArrayList<MethodInfo> methodList;	
	private ArrayList<String> parentList;	
	private ArrayList<String> implementedBy;	
	
	public ArrayList<String> getImplementedBy() {
		return implementedBy;
	}
	public void setImplementedBy(ArrayList<String> implementedBy) {
		this.implementedBy = implementedBy;
	}
	public ArrayList<String> getParentList() {
		return parentList;
	}
	public void setParentList(ArrayList<String> parentList) {
		this.parentList = parentList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassVisibility() {
		return classVisibility;
	}
	public void setClassVisibility(String classVisibility) {
		this.classVisibility = classVisibility;
	}
	public ArrayList<VariableInfo> getVariableList() {
		return variableList;
	}
	public void setVariableList(ArrayList<VariableInfo> variableList) {
		this.variableList = variableList;
	}
	public ArrayList<MethodInfo> getMethodList() {
		return methodList;
	}
	public void setMethodList(ArrayList<MethodInfo> methodList) {
		this.methodList = methodList;
	}
	
}
