package com.scannerpracticeDay1;

public class BankAccount {
	int accoutNumber;
	String accountHolder;
	int balance = 0;
	
	public BankAccount(int accoutNumber, String accountHolder ) {
		this.accoutNumber = accoutNumber;
		this.accountHolder = accountHolder;
	}
	
	public void displayAccountDetails() {
		System.out.println("Account Number : " + this.accoutNumber);
		System.out.println("Account Holder : " + this.accountHolder);
		System.out.println("Account Balance : "+ this.balance);
	}
	
	public void deposit(int amount) {
		this.balance += amount;
		System.out.println("An amount of INR " + amount + " has credited to your account number. "
				+ "Total Available balance INR " + this.balance +".");
	}
	
	public void withdraw(int amount) {
		if(amount > this.balance) {
			System.out.println("Insufficient Balance");
		}else {
			this.balance -= amount;
			System.out.println("An amount of INR " + amount + " has Debited from your account number. "
					+ "Total Available balance INR " + this.balance +".");
		}
	}
	
	
}
