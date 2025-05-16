package com.scannerClassWork;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scan.nextInt();
		System.out.println("-------------------------");
		
		Table table = new Table();
		table.getTable(num);
		System.out.println("-------------------------");
		
		EvenOdd ev = new EvenOdd();
		ev.isEvenOdd(num);
		System.out.println("-------------------------");
		
		Prime prime = new Prime();
		prime.isPrime(num);
		System.out.println("-------------------------");
		
		scan.close();

	}

}
