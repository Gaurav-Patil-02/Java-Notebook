package com.practiceOnConstructors;

public class FibbonacciSeries {
	public FibbonacciSeries() {
		int a = 0, b = 1, next;
		for(int i = 0; i <= 10; i++) {
			next = a + b;
			System.out.print(next+" ");
			a = b;
			b = next;
		}
		System.out.println();
	}
}
