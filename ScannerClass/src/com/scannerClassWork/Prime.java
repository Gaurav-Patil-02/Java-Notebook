package com.scannerClassWork;

public class Prime {
	public void isPrime(int num) {
		if(num == 1) {
			System.out.println("Not prime or Composite");
		}
		for(int i = 2; i <= num; i++) {
			if(num % i == 0) {
				System.out.println("Composite Number");
				break;
			}else {
				System.out.println("Prime Number");
				break;
			}
		}
	}
}
