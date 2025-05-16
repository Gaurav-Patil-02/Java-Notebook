package com.inheritanceday3;

public class Dog extends Animal{
	
	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("Dog Barks...");
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.makeSound();
	}

}
