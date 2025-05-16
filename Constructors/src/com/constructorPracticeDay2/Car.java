package com.constructorPracticeDay2;

public class Car {
	String brand;
	String model;
	int price;
	
	public Car(String brand, String model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}
	
	
}
