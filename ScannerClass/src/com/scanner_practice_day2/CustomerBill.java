package com.scanner_practice_day2;

import java.util.Scanner;

public class CustomerBill {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Customer Name: ");
		String name = scan.nextLine();

		System.out.print("Enter Number of Food Items: ");
		int quantity = scan.nextInt();

		System.out.println("Enter Price Per Item: ");
		double pricePerItem = scan.nextDouble();
		Customer customer = new Customer(name, quantity, pricePerItem);
		customer.printBill();
	}

}