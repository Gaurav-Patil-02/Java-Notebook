package com.inheritanceday2;

public class Person extends Employee {
	public void displayPerson() {
		System.out.println("Inside the method of Person");
	}
	
	
	public static void main(String[] args) {
		Person p = new Person();
		p.displayPerson();
		p.displayEmployee();
		p.displayManager();
	}
}
