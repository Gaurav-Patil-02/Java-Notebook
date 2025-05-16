package com.constructorPracticeDay3;

public class Product {
	private int productId;
	private String productName;
	private double price;
	private int stock;
		
	public Product(int productId, String productName, double price, int stock) {
	    this.productId = productId;
	    this.productName = productName;
	    this.price = price;
	    this.stock = stock;
	    }

	public void purchaseProduct(int quantity) {
		if (quantity <= 0) {
			System.out.println("Quantity should be positive.");
		} else if (quantity > stock) {
			System.out.println("Not enough stock available.");
		} else {
			stock -= quantity;
			System.out.println("Purchase successful! " + quantity + " unit(s) bought.");
		}
	}

	public void addStock(int quantity) {
		if (quantity > 0) {
			stock += quantity;
			System.out.println(quantity + " units added to stock.");
		} else {
			System.out.println("Quantity should be positive.");
		}
	}

	public void displayProductDetails() {
		System.out.println("Product ID: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
		System.out.println("Stock: " + stock + " units");
	}
}


