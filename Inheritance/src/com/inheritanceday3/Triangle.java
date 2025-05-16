package com.inheritanceday3;

public class Triangle extends Shape {
	public void area(int base, int height) {
		double area = 0.5 * base * height;
		System.out.println("Area of Triangle: " + area);
	}

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.itsShape();
		t.area(50, 500);
	}
}
