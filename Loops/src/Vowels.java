import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char ch = Character.toLowerCase(str.charAt(i));
			switch (ch) {
			case 'a':
			case 'i':
			case 'e':
			case 'o':
			case 'u':
				System.out.println(ch + " is a Vowel");
				break;
			default:
				System.out.println(ch + " is a Consonent ");
			}
		}
	}

}
