package com.classwork;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bank = new BankAccount();
		bank.setAccNo(1561);
		bank.setAccHoldName("Somanath");
		bank.setBalance(0);
		
		bank.deposite(500000);
		bank.withdraw(4500);
		
		System.out.println("Account Holder : "+bank.getAccHoldName());
		System.out.println("Account Number : "+ bank.getAccNo());
		System.out.println("Balance : " + bank.getBalance());

	}

}
