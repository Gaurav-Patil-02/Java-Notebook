package com.constructorPracticeDay2;

public class Laptop {
	String brand;
	String ram;
	String storage;
	
	public Laptop(String brand, String ram, String storage) {
		this.brand = brand;
		this.ram = ram;
		this.storage = storage;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", storage=" + storage + "]";
	}
	
	
}
