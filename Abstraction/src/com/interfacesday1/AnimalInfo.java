package com.interfacesday1;

public  class AnimalInfo {
	public static void main(String args[]) {
		Dog d = new Dog();
		d.sound();
		d.color();
		System.out.println("--------------------");
		
		Cat c = new Cat();
		c.sound();
		d.color();
		System.out.println("--------------------");
		
		Cow cow = new Cow();
		cow.sound();
		cow.color();
		System.out.println("--------------------");
	}
}
