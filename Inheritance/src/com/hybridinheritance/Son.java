package com.hybridinheritance;

public class Son extends Father {
	public void showSon() {
		System.out.println("Method of Son");
	}

	public static void main(String[] args) {
		Son s = new Son();
		s.showGrandFather();
		s.showFather();
		s.showSon();
	}
}
