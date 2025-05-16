package com.inheritanceday2;

public class Laptop extends Computer{
	public void carry() {
		System.out.println("Carrying Laptop...");
	}
	
	public static void main(String[] args) {
		Laptop lap = new Laptop();
		lap.powerOn();
		lap.boot();
		lap.carry();
	}
}
