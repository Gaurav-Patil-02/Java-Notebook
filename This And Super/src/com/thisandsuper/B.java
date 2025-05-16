package com.thisandsuper;

public class B extends A {
	@Override
	public void display() {
		super.display();
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.display();
	}
}
