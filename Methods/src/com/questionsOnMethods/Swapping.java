package com.questionsOnMethods;

public class Swapping {
	public static void swap(int a, int b) {
		System.out.println("Before swappin a : " + a + " and b : " + b );
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swappin a : " + a + " and b : " + b );
	}
public static void main(String[] args) {
	Swapping.swap(42, 75);
}
}
