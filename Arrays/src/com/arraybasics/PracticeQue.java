package com.arraybasics;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeQue {

	// Que 1
	public static void printArray() {
		int arr[] = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(arr));
	}

	// Que 2
	public static void printOneByOne() {
		int arr[] = { 10, 20, 30, 40, 50 };
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	// Que 3
	public static void takeUserInput() {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
	}
	
	// Que 4
	public static void sumOfArray() {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();

			sum += arr[i];
		}
		System.out.println("Sum of Array : " + sum);
	}

	// Que 5
	public static void evenNumbers() {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			if (arr[i] % 2 == 0) {
				System.out.println("Even Numbers of Array : " + arr[i]);
			}
		}

	}


	// Que 6
	public static void largest() {
		int arr[] = { 15, 25, 63, 55, 25, 36, 45 };
		int largest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			}
		}
		System.out.println(largest);
	}
	
	public static void coutnNum() {
		String str = "Gaurav@123";
		int arr1[] = {0,1,2,3,4,5,6,7,8,9};
		int count = 0;
		for(int i = 0; i< str.length();i++) {
			if(arr1[i] == (int)str.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
	
//		printArray();
//		printOneByOne();
//		takeUserInput();
//		sumOfArray();
//		evenNumbers();
//		largest();
		coutnNum();
	}

}
