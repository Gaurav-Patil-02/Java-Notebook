package com.constructorPracticeDay2;

public class Mobile {
	String brand;
	String model;
	int price;
	
	public Mobile(String brand, String model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}
	

}
