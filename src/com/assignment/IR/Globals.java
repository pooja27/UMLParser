package com.assignment.IR;

import java.util.HashMap;
import java.util.HashSet;

public class Globals {
	public static HashMap<String,ClassInfo> classList = new HashMap();
	public static HashMap<String,InterfaceInfo> interfacesList = new HashMap();
	public static HashSet<String> primitiveHash = new HashSet<String>();
	public static HashSet<String> collectionType = new HashSet<String>();
	public static HashMap<String,Cardinality> arrowMappings = new HashMap<String, Cardinality>();
	public static HashMap<String,InterfaceUses> interfaceUses = new HashMap<>();
	public static HashMap<String,String> localVarAssocs = new HashMap<>();
	public static HashSet<String> accessSpecifiers = new HashSet<String>();
	
	static {
		primitiveHash.add("boolean");
		primitiveHash.add("char");
		primitiveHash.add("byte");
		primitiveHash.add("short");
		primitiveHash.add("int");
		primitiveHash.add("long");
		primitiveHash.add("float");
		primitiveHash.add("double");
		primitiveHash.add("String");
				
		collectionType.add("[]");
		collectionType.add("Collection<");
		collectionType.add("List<");
		collectionType.add("ArrayList<");
		
		accessSpecifiers.add("public");
		accessSpecifiers.add("private");
		accessSpecifiers.add("protected");
		
	}
	//public HashMap<String,ClassInfo> classList = new HashMap();

}
