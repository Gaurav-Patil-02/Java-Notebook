package com.thisandsuper;

public class Manager extends Employee {
	@Override
	public void show() {
		super.show();
	}
	
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.show();
	}
}
