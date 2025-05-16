import java.util.Scanner;

public class ValidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scan.nextInt();
		
		if(num <= 20) {
			System.out.println("Number is Valid");
		}else {
			System.out.println("Number is not valid");
		}

	}

}
