package com.classwork;

public class Car {
	private String model;
	private int year;
	private int price;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price <= 0) {
			System.out.println("Price should be greater than 0");
		} else {
			this.price = price;
		}

	}

	public void carDetails() {
		System.out.println("Car Model :" + getModel());
		System.out.println("Car Year : " + getYear());
		System.out.println("Car Price : " + getPrice());

	}

}
