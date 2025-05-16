package com.inheritanceday2;

public class Smartphone extends Mobile {
	public void browseInternet() {
		System.out.println("Browsing over Internet");
	}
	public static void main(String[] args) {
		Smartphone s = new Smartphone();
		s.call();
		s.browseInternet();
	}
}
