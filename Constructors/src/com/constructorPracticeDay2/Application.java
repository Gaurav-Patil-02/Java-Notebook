package com.constructorPracticeDay2;

import java.util.Arrays;

public class Application {
	public static void main(String[] args) {
		Student student = new Student("Manoj", 22);
		System.out.println(student);
		System.out.println("--------------------");
		
		Employee emp = new Employee(7559,"Shrirish",  220000);
		System.out.println(emp);
		System.out.println("--------------------");
		
//		System.exit(0);
		
		Product pr = new Product(7559,"Mobile",  22000);
		System.out.println(pr);
		System.out.println("--------------------");
		
		Book book = new Book("Game of Thrones","George R. R. Martin",  2000);
		System.out.println(book);
		System.out.println("--------------------");
		
		Car car = new Car("Tata","Harrier",  2000000);
		System.out.println(car);
		System.out.println("--------------------");
		
		Rectangle rec = new Rectangle(14, 85);
		System.out.println("--------------------");
		
		Laptop lap = new Laptop("Asus","8GB","256GB");
		System.out.println(lap);
		System.out.println("--------------------");
		
		Movie movie = new Movie("Chaavaa","Biography, Drama",  10);
		System.out.println(movie);
		System.out.println("--------------------");
		
		Mobile mobile = new Mobile("Motorola","Edge 40 Neo",  22000);
		System.out.println(mobile);
		System.out.println("--------------------");
		
		Circle circle = new Circle(14);
		System.out.println("--------------------");	
		
//		int arr[] = {15,253,82,652,458,85,36};
//		int copyArr[] = new int[arr.length-1];
//		System.arraycopy(arr, 0, copyArr,0, arr.length-1);
//		System.out.println(Arrays.toString(copyArr));
		
//		System.out.println(System.currentTimeMillis());
//		System.out.println(System.nanoTime());
//		System.out.println(System.getProperty("os.name"));
//		System.out.println(System.getProperty("java.version"));
		
	}
}
