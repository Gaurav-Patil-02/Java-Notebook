package com.homework;

public class ReverseString {
	public void reverse(String str) {
		String rev = "";
		char ch;
		
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			rev = ch + rev;
	}
			System.out.println("Reversed String " + rev);
	}
}
