package com.interfacesday1;

public class PhonePay implements Bank{

	@Override
	public void makePayment() {
		System.out.println("Making Payment via Phone Pay.....");
	}
	
	public static void main(String[] args) {
		PhonePay p = new PhonePay();
		p.makePayment();
}
}
