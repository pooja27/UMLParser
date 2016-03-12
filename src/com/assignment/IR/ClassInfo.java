package com.assignment.IR;

import java.util.ArrayList;

public class ClassInfo {
	private String name;
	private boolean isParent;
	private String classVisibility;
	
	private ArrayList<VariableInfo> variableList;
	private ArrayList<MethodInfo> methodList;
	private ArrayList<String> interfaceList;
	private String parentName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isParent() {
		return isParent;
	}
	public void setParent(boolean isParent) {
		this.isParent = isParent;
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
	public ArrayList<String> getInterfaceList() {
		return interfaceList;
	}
	public void setInterfaceList(ArrayList<String> interfaceList) {
		this.interfaceList = interfaceList;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
}


