import java.util.Scanner;

public class GameSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Select difficulty level (1: Easy, 2: Medium, 3: Hard):");
	        int level = scanner.nextInt();
	        

	        switch (level) {
	            case 1:
	                System.out.println("Easy Level: Relax and Enjoy!");
	                break;
	            case 2:
	                System.out.println("Medium Level: Get Ready for a Challenge!");
	                break;
	            case 3:
	                System.out.println("Hard Level: Brace Yourself!");
	                break;
	            default:
	                System.out.println("Invalid level");
	        }
	        
	}

}
