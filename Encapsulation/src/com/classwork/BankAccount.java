package com.classwork;

public class BankAccount {
	private int accNo;
	private String accHoldName;
	private int balance;
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccHoldName() {
		return accHoldName;
	}

	public void setAccHoldName(String accHoldName) {
		this.accHoldName = accHoldName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposite(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		if(amount >= balance) {
			System.out.println("Insufficient Balance");
		}else {
			balance -= amount;
		}
	}

}
