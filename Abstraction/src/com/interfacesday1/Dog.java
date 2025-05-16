package com.interfacesday1;

public class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("Dog is barking");
		
	}

	@Override
	public void color() {
		System.out.println("Dog color : Brown");
		
	}
	
}