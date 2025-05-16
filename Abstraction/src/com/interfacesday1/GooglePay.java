package com.interfacesday1;

public class GooglePay implements Bank {

	
	@Override
	public void makePayment() {
		System.out.println("Making payment via Google pay");
		
	}
	public static void main(String[] args) {
			GooglePay gp = new GooglePay();
			gp.makePayment();
	}

	

}
