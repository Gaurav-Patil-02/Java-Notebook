package com.inheritanceday2;

public class Circle extends Shape2 {
	public void area(float redius) {
		System.out.println("Area of Circle is " + (3.14 * (redius * redius)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.draw();
		c.area(56);

	}

}
