package com.inheritanceday2;

public class Human extends Mammal {
	public void think() {
		System.out.println("Human is thinking...");
	}
	
	public static void main(String[] args) {
		Human h = new Human();
		h.eat();
		h.walk();
		h.think();
	}
}
