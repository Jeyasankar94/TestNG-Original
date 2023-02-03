package org.basic.java;

public class ParameterizedConstructorSample {

	String animal;
	String country;

	public ParameterizedConstructorSample(String name, String type) {
		animal = name;
		country = type;
	}				//if we are in same constructor we have to call by its argument name
	public void aboutAnimal(){ // we calling variable name bcz we are in another method 
		System.out.println("The name is "+animal+ "origin from "+country);
	}
	public static void main(String[] args) {
		ParameterizedConstructorSample pc = new ParameterizedConstructorSample("tiger", "Indian");
		pc.aboutAnimal();
		ParameterizedConstructorSample pc2 = new ParameterizedConstructorSample("Lion", "tamilnadu");
		pc2.aboutAnimal();
	}
}
