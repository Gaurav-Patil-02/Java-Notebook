
//Convert a Number (1-7) into a Weekday
// 1 = Sunday, 2 = Monday, ..., 7 = Saturday.
import java.util.Scanner;

public class NumToDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int day = scan.nextInt();

		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wedsday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Satarday");
			break;
		default:
			System.out.println("Invalid Input");
		}

	}

}
