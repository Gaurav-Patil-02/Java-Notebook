package com.homework;

public class ArmstrongNumber {
	public void isArmstrong(int num) {
		int org = num;
		int digit;
		int sum = 0;
		while(num > 0) {
			digit = num % 10;
			sum += Math.pow(digit, 3);
			num /= 10;
		}
	
		if(sum == org) {
			System.out.println("Given Number is an Armstrong ");
		}else {
			System.out.println("Given Number is not an Armstrong");
		}
	}
}
