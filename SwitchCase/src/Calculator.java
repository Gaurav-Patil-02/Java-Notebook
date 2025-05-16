import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Values");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("Enter Operator");
		char opr = scan.next().charAt(0);
		
		
		
		switch(opr) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		case '%':
			System.out.println(num1 % num2);
			break;
		default:
			System.out.println("Invalid operator");
		}
	}

}
