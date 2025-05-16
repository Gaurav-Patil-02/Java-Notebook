package com.scanner_practice_day2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("1. Addition \n2. Substraction \n3. Multiplication \n4. Division");
		int ch = scan.nextInt();

		System.out.println("Enter any Two Numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		CalculatorOperations cal = new CalculatorOperations(num1, num2);

		switch (ch) {
		case 1:
			cal.add();
			break;
		case 2:
			cal.sub();
			break;
		case 3:
			cal.mul();
			break;
		case 4:
			cal.div();
			break;
		default:
			System.out.println("Invalid Choice");

		}

	}

}
