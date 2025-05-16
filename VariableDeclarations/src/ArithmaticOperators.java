
public class ArithmaticOperators {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		
		System.out.println("Addition : " + (a + b));
		System.out.println("Substraction : " + (a - b));
		System.out.println("Multiplication : " + (a * b));
		System.out.println("Division : " + (a / b));
		System.out.println("Remainder : " + (a % b));
		System.out.println();
		
		
		int length = 22;
		int breadth = 32;
		System.out.println("Ared of Rectangle : " + (length * breadth));
		System.out.println();
		
		int side = 42;
		System.out.println("Area of Square : "+ (side * side));
		System.out.println();
		
		//2π r h + 2π r²
		int radius = 12;
		int height = 45;
		float pi = 3.14f;
		
		double areaOfCylinder = (2 * pi) * radius * height + (2 * pi) * (radius * radius);
		System.out.println("Area of Cylinder : " + areaOfCylinder );
		System.out.println();
		
		// 1/2 × b × h.
		double areaOfTriangle = 1/2 * (breadth * height);
		System.out.println("Area of Triangle : " + areaOfTriangle);
		
		
		
		
		
		
		
		
	}
}
