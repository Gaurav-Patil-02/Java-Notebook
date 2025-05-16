import java.util.Scanner;

public class SeasonAdvisory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter season (1: Summer, 2: Winter, 3: Rainy):");
        int season = scanner.nextInt();

        switch (season) {
            case 1:
                System.out.println("Stay Hydrated!");
                break;
            case 2:
                System.out.println("Wear Warm Clothes!");
                break;
            case 3:
                System.out.println("Carry an Umbrella!");
                break;
            default:
                System.out.println("Invalid season");
        }

	}

}
