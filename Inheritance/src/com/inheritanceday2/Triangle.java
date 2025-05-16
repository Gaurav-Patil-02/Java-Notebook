package com.inheritanceday2;

public class Triangle extends Polygon{
	public void showTriangle() {
		System.out.println("This is an Triangle");
	}
	
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.displayShape();
		t.showPolygon();
		t.showTriangle();
		
	}
}
