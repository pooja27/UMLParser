package com.assignment.IR;



public class VariableInfo {
	
	private String name;
	private String varVisibility;
	private String dataType;
	private boolean isCollection;
	private boolean isPrimitive;
	
	public boolean isPrimitive() {
		return isPrimitive;
	}
	public void setPrimitive(boolean isPrimitive) {
		this.isPrimitive = isPrimitive;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVarVisibility() {
		return varVisibility;
	}
	public void setVarVisibility(String varVisibility) {
		this.varVisibility = varVisibility;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public boolean isCollection() {
		return isCollection;
	}
	public void setCollection(boolean isCollection) {
		this.isCollection = isCollection;
	}
	
	

}
