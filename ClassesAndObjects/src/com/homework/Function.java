package com.homework;

import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Any Number");
		int num = scan.nextInt();
		
		Palindrome pal = new Palindrome();
		pal.isPalindrome(num);
		System.out.println();
		
		PrimeNumber prime = new PrimeNumber();
		prime.isPrime(num);
		System.out.println();
		
		ArmstrongNumber arm = new ArmstrongNumber();
		arm.isArmstrong(num);
		System.out.println();
		
		ReverseString revStr = new ReverseString();
		revStr.reverse("Gaurav");
		System.out.println();
		
		
		

	}

}
