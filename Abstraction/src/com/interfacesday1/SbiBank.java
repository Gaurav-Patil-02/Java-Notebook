package com.interfacesday1;

public class SbiBank implements Bank {

	@Override
	public void makePayment() {
		
		System.out.println("Make a Payment...");
	}
	
	
	public static void main(String[] args) {
		SbiBank sbi = new SbiBank();
		sbi.makePayment();
	}

}
