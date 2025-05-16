package com.constructorPracticeDay2;

public class Product {
	int productId;
	String productName;
	int price;
	
	public Product(int productId, String productName, int price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}
	
	
}
