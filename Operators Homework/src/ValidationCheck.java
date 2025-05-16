
//Write a java program to check weather a person is eligible for age or not

import java.util.Scanner;

public class ValidationCheck {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your Age");
		int age = scan.nextInt();
		
		if(age >= 18) {
			System.out.println("Congrats! You are eligible for vote");
		}else {
			System.out.println("Sorry! You are not eligible for vote");
		}
		
		
	}
}
