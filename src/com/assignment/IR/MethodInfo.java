package com.assignment.IR;

import java.util.ArrayList;

public class MethodInfo {
	
	private String name;
	private String returnType;
	private boolean isReturnTypeCollection;
	private boolean isStatic;
	private boolean isGetterSetter;
	private String methodVisibilty;
	
	private ArrayList<VariableInfo> localParameterList; 
	private ArrayList<VariableInfo> parameterList;
	
	
	public MethodInfo() {
		name = "";
		returnType = "";
		isReturnTypeCollection = false;
		isStatic = false;
		methodVisibilty = "";
		parameterList = new ArrayList();
		localParameterList = new ArrayList();
	}
	public ArrayList<VariableInfo> getLocalParameterList() {
		return localParameterList;
	}
	public void setLocalParameterList(ArrayList<VariableInfo> localParameterList) {
		this.localParameterList = localParameterList;
	}
	public boolean isGetterSetter() {
		return isGetterSetter;
	}
	public void setGetterSetter(boolean isGetterSetter) {
		this.isGetterSetter = isGetterSetter;
	}
	
	
	public String getMethodVisibilty() {
		return methodVisibilty;
	}
	public void setMethodVisibilty(String methodVisibilty) {
		this.methodVisibilty = methodVisibilty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReturnType() {
		return returnType;
	}
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
	public boolean isReturnTypeCollection() {
		return isReturnTypeCollection;
	}
	public void setReturnTypeCollection(boolean isReturnTypeCollection) {
		this.isReturnTypeCollection = isReturnTypeCollection;
	}
	public boolean isStatic() {
		return isStatic;
	}
	public void setStatic(boolean isStatic) {
		this.isStatic = isStatic;
	}
	public ArrayList<VariableInfo> getParameterList() {
		return parameterList;
	}
	public void setParameterList(ArrayList<VariableInfo> parameterList) {
		this.parameterList = parameterList;
	}
}
