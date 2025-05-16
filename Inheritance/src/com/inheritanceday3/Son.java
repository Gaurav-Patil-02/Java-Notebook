package com.inheritanceday3;

public class Son extends Father {
	public void showSon() {
		System.out.println("This is a method of Son");
	}

	public static void main(String[] args) {
		Son son = new Son();
		son.showGrandfather();
		son.showFather();
		son.showSon();
	}
}
