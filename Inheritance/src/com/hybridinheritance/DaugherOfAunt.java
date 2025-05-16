package com.hybridinheritance;

public class DaugherOfAunt extends Aunt{
	public void showDaughterOfAutn() {
		System.out.println("Method of Daughter of Aunt");
	}
	
	
	public static void main(String[] args) {
		DaugherOfAunt d = new DaugherOfAunt();
		d.showGrandFather();
		d.showAunt();
		d.showDaughterOfAutn();
	
	}
}
