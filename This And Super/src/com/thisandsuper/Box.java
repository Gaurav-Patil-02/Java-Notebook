package com.thisandsuper;

public class Box {
	int length;
	int width;
	int height;

	public Box(int length, int width, int height) {

		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	
	public int volume() {
		return this.length * this.width * this.height;
	}
	
	public static void main(String[] args) {
		Box box = new Box(42,25,36);
		System.out.println(box.volume());
	}
}
