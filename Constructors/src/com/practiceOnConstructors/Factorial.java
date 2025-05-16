package com.practiceOnConstructors;

public class Factorial {
	public Factorial() {
		int num = 5;
		int fact = 1;
		for(int i = 1; i <= 5; i++) {
			 fact = fact * i;
		}
		System.out.println("Factorial of " +num + " : " + fact);
	}
}
