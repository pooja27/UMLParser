package com.assignment.IR;

public class InterfaceUses {
	String className;
	String interfaceName;
	public InterfaceUses(String className, String interfaceName) {
		super();
		this.className = className;
		this.interfaceName = interfaceName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getInterfaceName() {
		return interfaceName;
	}
	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}
}
