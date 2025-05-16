package com.twoDArrays;

import java.util.Arrays;

public class TwoDArrayPractice {
	public static void main(String[] args) {
		int[][] arr = { { 10, 55, 652, 52, 36 }, { 62, 25, 552, 52, 441, 25 } };
		System.out.println(Arrays.deepToString(arr)); // Print 2D Array

		for (int num[] : arr) { // Print Separate array element
			for (int num1 : num) {
				System.out.print(num1 + " ");
			}
		}
		System.out.println();

		System.out.println(arr.length); // Print length of Row
		System.out.println(arr[0].length); // Print length of Column

		int row = 0;
		int col = 0;
		for (int[] num : arr) {
			row++; // Find row length without using arr.length
		}
		for (int num : arr[0]) {
			col++; // Find Column length without using arr.length
		}

		System.out.println("Row length :" + row + ", Column length :" + col);

		for(int num[] : arr) {
			Arrays.sort(num);				//Sorting of Two D Array
			System.out.println(Arrays.toString(num)); 
		}
		
		
		int largest = 0;
		for(int[] i : arr) {
			for(int large : i) {				//Find largest from two d array
				if(large > largest) {
					largest = large;
				}
			}
		}
		
		System.out.println("Largest number : " + largest);
		
		
	 int sum = 0;
	 for(int[] i : arr) {
		 for(int s : i) {
			 sum += s;
		 }
	 }
	 System.out.println("Sum of array : " + sum);
		
	}
}
