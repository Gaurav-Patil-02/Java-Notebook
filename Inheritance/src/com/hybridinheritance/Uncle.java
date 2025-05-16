package com.hybridinheritance;

public class Uncle extends GrandFather {
	public void showUncle() {
		System.out.println("Method of Uncle");
	}
	
	public static void main(String[] args) {
		Uncle u = new Uncle();
		u.showGrandFather();
		u.showUncle();
	}
}
