package com.scannerpracticeDay1;

import java.util.Scanner;

public class RemoveVowelFromString {
	String str;
	public RemoveVowelFromString() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any String");
		str = scan.nextLine();
	}
	
	public void removeVowels() {
		String newStr = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = Character.toLowerCase(str.charAt(i));
			if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
				continue;
			}else {
				newStr += ch;
			}
			
		}
		System.out.println("String without vowels : " + newStr);
	}
}
