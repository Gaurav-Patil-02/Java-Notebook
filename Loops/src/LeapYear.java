import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Year");
		int n = scan.nextInt();
		
		if(n % 4 == 0 && n % 100 != 0 || (n % 400 == 0)) {
			System.out.println(n + " is  a Leap year");
		}else {
			System.out.println(n + " is not a Leap year");
		}

	}

}
