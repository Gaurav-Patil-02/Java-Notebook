package com.multithreadingday1;

public class Video extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Video " + i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
