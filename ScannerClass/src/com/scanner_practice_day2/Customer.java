package com.scanner_practice_day2;

public class Customer {

	String customerName;
	int quantity;
	double pricePerItem;

	double totalBill;
	double gst;
	double totalPayable;

	public Customer(String customerName, int quantity, double pricePerItem) {
		this.customerName = customerName;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
		
		calculateBill();
	}
	
	 public void calculateBill() {
	        totalBill = quantity * pricePerItem;
	        gst = totalBill * 0.05;
	        totalPayable = totalBill + gst;
	    }
	 
	   public void printBill() {
	        System.out.println("\n====== CUSTOMER BILL ======");
	        System.out.println("Customer Name     : " + customerName);
	        System.out.println("Items Ordered     : " + quantity);
	        System.out.println("Price per Item    : ₹" +  pricePerItem);
	        System.out.println("Total Bill        : ₹" + totalBill);
	        System.out.println("GST (5%%)         : ₹" + gst);
	        System.out.println("-----------------------------");
	        System.out.println("Total Payable     : ₹" + totalPayable);
	        System.out.println("===========================");
	    }

}
