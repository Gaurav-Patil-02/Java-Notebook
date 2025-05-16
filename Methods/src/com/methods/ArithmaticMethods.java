package com.methods;

public class ArithmaticMethods {

	public static void addition() {
		int a = 10, b = 15;
		System.out.println("Addition : " + (a + b));
	}

	public static void substraction() {
		int a = 10, b = 15;
		System.out.println("Subtraction : " + (a - b));
	}

	public static void multiplication() { 
		int a = 10, b = 15;
		System.out.println("Multiplication : " + (a * b));
	}

	public static void division() {
		int a = 10, b = 15;
		System.out.println("Division : " + (a / b));
	}

	public static void main(String[] args) {
		
		ArithmaticMethods.addition();
		ArithmaticMethods.substraction();
		ArithmaticMethods.multiplication();
		ArithmaticMethods.division();
	}
}
