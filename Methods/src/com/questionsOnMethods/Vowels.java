package com.questionsOnMethods;

public class Vowels {
	
	public static void vowels(char ch) {
		switch (ch) {
		case 'a':
		case 'i':
		case 'e':
		case 'o':
		case 'u':
			System.out.println(ch + " is a Vowel");
			break;
		default:
			System.out.println(ch + " is a Consonent ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowels.vowels('z');

	}

}
