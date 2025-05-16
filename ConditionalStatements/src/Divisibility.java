import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Any  number");
		int num = scan.nextInt();
		
		if(num % 11 == 0 && num % 5 == 0) {
			System.out.println(num + " is divisible by both 5 and 11");
		}else {
			System.out.println(num + " is not divisible by  5 and 11");
		}
		

	}

}
