package com.homework;

public class Palindrome {
	public void isPalindrome(int num) {
		int org = num;
		int reverse = 0;
		while(num > 0) {
			reverse = (reverse * 10) + (num % 10);
			num /= 10;
		}
		
		if(reverse == org) {
			System.out.println("Given Number is an Palindrome");
		}else {
		System.out.println("Given Number is not an Palindrome");
		}
	}
	
}
