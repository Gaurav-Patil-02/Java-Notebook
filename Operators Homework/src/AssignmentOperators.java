
//Write a java program to demonstrate all assignment operators
public class AssignmentOperators {
	public static void main(String args[]) {
		
	int a = 12;
	int b = 14;
	
	System.out.println("a += b = " + (a += b ));
	System.out.println("a -= b = " + (a -= b ));
	System.out.println("a *= b = " + (a *= b ));
	System.out.println("a /= b = " + (a /= b ));
	System.out.println("a %= b = " + (a %= b ));
}
}