import java.util.Scanner;

public class ArithmaticOperators {
// Write a java program to add, subtract, multiply and divide two numbers entered by the user.
	
	public static void main(String args[]) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter any two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("Addition : " + (a+b));
		System.out.println("Substraction : " + (a-b));
		System.out.println("Multiplication : " + (a*b));
		System.out.println("Division : " + (a/b));
		System.out.println("Modulo (Remainder) : " + (a%b));
}
}
