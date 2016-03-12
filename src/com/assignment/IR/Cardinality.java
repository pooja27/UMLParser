package com.assignment.IR;

public class Cardinality {
	String srcCardinality;
	String targetCardinality;
	
	
	public Cardinality(String srcCardinality, String targetCardinality) {
		super();
		this.srcCardinality = srcCardinality;
		this.targetCardinality = targetCardinality;
	}
	public String getSrcCardinality() {
		return srcCardinality;
	}
	public void setSrcCardinality(String srcCardinality) {
		this.srcCardinality = srcCardinality;
	}
	public String getTargetCardinality() {
		return targetCardinality;
	}
	public void setTargetCardinality(String targetCardinality) {
		this.targetCardinality = targetCardinality;
	}
	
	
	

}
