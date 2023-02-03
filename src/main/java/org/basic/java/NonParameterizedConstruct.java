package org.basic.java;

public class NonParameterizedConstruct {
	
	String name;
	int empId;
	
	public NonParameterizedConstruct() {
		name="Jeya";
		empId =2;
		System.out.println("Employee details created successfully");	
	}
	
	public static void main(String[] args) {
		NonParameterizedConstruct npc = new NonParameterizedConstruct();
		System.out.println(npc.name);
		System.out.println(npc.empId);
	}

}
