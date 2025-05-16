package com.thisandsuper;

public class ConstructorCall {
	int id;
	String name;
	
	public ConstructorCall() {
		System.out.println("Non-para Const");
	}
	public ConstructorCall(int id, String name) {
		this();
		this.id = id;
		this.name = name;
		
		System.out.println("Parameterized Const");
	}
	
	public static void main(String[] args) {
		ConstructorCall cc = new ConstructorCall(1,"somanath");
	}
	
	
}
