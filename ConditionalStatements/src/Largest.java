import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Any three numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is greater");
		}else if(num2 > num3) {
			System.out.println(num2 + " is greater");
		}else {
			System.out.println(num3 + " is greater");
		}

	}

}
