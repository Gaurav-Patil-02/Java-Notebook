package com.inheritanceday1;

public class Marks extends Student{
	int sub1;
	int sub2;
	
	public Marks(int sub1, int sub2, String name, int rollNo) {
		super(name, rollNo);
		this.sub1 = sub1;
		this.sub2 = sub2;
	}



	public void getTotal() {
		System.out.println("Total Marks : "+(sub1 + sub2));
	}
}
