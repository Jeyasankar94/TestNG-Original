package org.basic.java;

public class ChildParentConstructor extends ParentClassConstru{
	
	//No parameterized Constructor
	public ChildParentConstructor() {
		System.out.println("Child class");	
	}
	public static void main(String[] args) {
		ChildParentConstructor cpc = new ChildParentConstructor();
	}
}
