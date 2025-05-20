package com.multithreadingday1;

public class Zoom {
	public static void main(String[] args) {
		Chat c  = new Chat();
		Mic m = new Mic();
		Video v = new Video();
		Audio a = new Audio();
		Participants p = new Participants();
		
		c.start();
		m.start();
		v.start();
		a.start();
		p.start();
		
	}
}
