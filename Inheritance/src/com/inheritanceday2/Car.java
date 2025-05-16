package com.inheritanceday2;

public class Car extends FourWheeler {
	public void drive() {
		System.out.println("I am driving a Car");
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		car.musicPlayer();
		car.drive();
	}
}
