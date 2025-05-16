package com.practiceOnConstructors;

public class Pattern {
	public Pattern() {
		for(int i = 0; i < 5; i++) {
			
			for(int j = i; j < 5; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
