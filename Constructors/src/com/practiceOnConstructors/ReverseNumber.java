package com.practiceOnConstructors;

public class ReverseNumber {
	public ReverseNumber() {
		int num = 45895;
		int org = num;
		int rev = 0;
		while(num > 0) {
			rev = (rev * 10) + (num % 10);
			num /= 10;
		}
		System.out.println("Original number = " + org);
		System.out.println("Reverse number = " + rev);
	}
}
