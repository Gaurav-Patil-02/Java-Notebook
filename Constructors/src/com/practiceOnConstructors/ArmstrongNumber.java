package com.practiceOnConstructors;

public class ArmstrongNumber {
	public ArmstrongNumber() {
		int num = 153;
		int org = num;
		int digit = 0;
		int sum = 0;
		while(num > 0) {
			digit = num % 10;
			sum += Math.pow(digit, 3);
			num /= 10;
		}
		
		if(org == sum) {
			System.out.println("Given number is an Armstrong number");
		}else {
			System.out.println("Given number is not an Armstrong number");
		}
	}
}
