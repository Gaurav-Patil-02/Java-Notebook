import java.util.Scanner;

public class TrainClassDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter class type (1: General, 2: Sleeper, 3: AC): ");
	        int classType = scanner.nextInt();
	        
	        switch (classType) {
	            case 1:
	                System.out.println("General Class Fare: Rs. 100");
	                break;
	            case 2:
	                System.out.println("Sleeper Class Fare: Rs. 200");
	                break;
	            case 3:
	                System.out.println("AC Class Fare: Rs. 500");
	                break;
	            default:
	                System.out.println("Invalid class type. Please enter 1, 2, or 3.");
	        }

	}

}
