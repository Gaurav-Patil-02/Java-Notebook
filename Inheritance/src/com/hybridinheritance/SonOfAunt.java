package com.hybridinheritance;

public class SonOfAunt extends Aunt {
	public void showSonOfAunt() {
		System.out.println("Method of Son of Aunt");
	}
	
	public static void main(String[] args) {
		SonOfAunt s = new SonOfAunt();
		s.showGrandFather();
		s.showAunt();
		s.showSonOfAunt();
	}
}
