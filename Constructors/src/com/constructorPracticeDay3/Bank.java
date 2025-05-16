package com.constructorPracticeDay3;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		BankAccount bank = new BankAccount(14563315, "Manoj Patil");
		
		Scanner scan = new Scanner(System.in);
		
		boolean flag = true;
		
		System.out.println("*** Welcome to State Bank of India ***");
		
		do {
		System.out.println("1. Account Status \n2. Deposite \n3. Withdraw \n4. Exit");
		int ch = scan.nextInt();
		
		switch(ch) {
		case 1:
			bank.displayAccountDetails();
			System.out.println("_______________________");
			break;
		case 2:
			System.out.println("Enter amount to deposite");
			int depAmount = scan.nextInt();
			bank.deposit(depAmount);
			break;
		case 3:
			System.out.println("Enter amount to Withdraw");
			int withAmount = scan.nextInt();
			bank.withdraw(withAmount);
			break;
		case 4:
			System.out.println("*** Thanks You for Visiting ***");
			flag = false;
			break;
		default:
			System.out.println("Invalid Choice");
		}
		}while(flag);
		
		
		
		scan.close();
		
	}
}
