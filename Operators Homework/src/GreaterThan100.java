
// Write a java program to find the number is greater than 100 or not

import java.util.Scanner;

public class GreaterThan100 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int a = scan.nextInt();
		
		if(a == 100) {
			System.out.println("Number is equals to 100");
		}
		else if(a > 100) {
			System.out.println("Number is greater than 100");
		}else {
			System.out.println("Number is less than 100");
		}
	}
}
