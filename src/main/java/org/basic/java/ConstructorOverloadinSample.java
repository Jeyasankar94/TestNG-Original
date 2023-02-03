package org.basic.java;

public class ConstructorOverloadinSample {

	String name;
	
	public ConstructorOverloadinSample() {
		
	}
	 ConstructorOverloadinSample(String childname){
		name = childname;//if we are in same constructor we have to call by its argument name
		System.out.println("Son name is "+childname);
	}
	public static void main(String[] args) {
		ConstructorOverloadinSample covld = new ConstructorOverloadinSample();
		ConstructorOverloadinSample covld2 = new ConstructorOverloadinSample("Sakthi");
		
	}
}
