package com.inheritanceday2;

public class Fan extends Appliance {
	public void rotate() {
		System.out.println("Rotating....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan f = new Fan();
		f.turnOn();
		f.rotate();

	}

}
