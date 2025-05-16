import java.util.Scanner;

public class PossitiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Any number");
		int num = scan.nextInt();
		
		if(num == 0) {
			System.out.println("Given Number is Zero");
		}else if(num > 0) {
			System.out.println("Given Number is Possitive");
		}else {
			System.out.println("Given Number is Negative");
		}

	}

}
