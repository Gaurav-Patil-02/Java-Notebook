
//Convert a Grade into Remarks
//A = Excellent, B = Good, C = Average, D = Poor, F = Fail.
import java.util.Scanner;

public class GradeToRemarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Grade");
		char grade = scan.next().charAt(0);

		switch (grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Poor");
			break;
		case 'F':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid Entry");
		}

	}

}
