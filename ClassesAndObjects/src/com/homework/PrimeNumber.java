package com.homework;

public class PrimeNumber {
		
	public void isPrime(int num) {
		if(num == 1) {
			System.out.println("1 is not a prime or composite");
		}
		
		for(int i = 2; i <= num; i++) {
			if(num % i == 0) {
				System.out.println("Given number is not a prime");
				break;
			}else {
				System.out.println("Given number is a prime");
				break;
				
			}
		}
	}
}
