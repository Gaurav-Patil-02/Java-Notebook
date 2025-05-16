package com.scanner_practice_day2;

public class CalculatorOperations {
	int num1;
	int num2;
	
	public CalculatorOperations(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void add() {
		System.out.println("Addition : " + (num1 + num2));
	}
	
	public void sub() {
		System.out.println("Substraction : " + (num1 - num2));
	}
	
	public void mul() {
		System.out.println("Multiplication : " + (num1 * num2));
	}
	
	public void div() {
		System.out.println("Division : " + (num1 / num2));
	}
	
	
}
