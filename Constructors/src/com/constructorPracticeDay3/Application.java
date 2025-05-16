package com.constructorPracticeDay3;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(1546, "Hemant", "BTech", 3, 96.35f);
		student.studentDetails();
		student.getGrade();
		
		System.out.println("-------------------------------------");
		
		Employee emp = new Employee(1524, "Chetan Patil", "AI Engineer", 50000 );
		emp.empDetails();
		emp.bonusSalary();
		
		System.out.println("-------------------------------------");
		
		Product product = new Product(101, "Wireless Mouse", 1000, 10);
        product.displayProductDetails();
        product.purchaseProduct(3);
        product.addStock(15);
        product.displayProductDetails();
        
    	System.out.println("-------------------------------------");
    	
    	 Book book = new Book(1001, "Game of Thrones", "George R.R. Martin", 200, 3);
         book.displayBookDetails();
         book.issueBook();
         book.returnBook();
         book.displayBookDetails();
         System.out.println("-------------------------------------");
	}

}
