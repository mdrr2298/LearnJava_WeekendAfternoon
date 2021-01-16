package basic;

import java.util.Scanner;

public class LearnScanner {
	
	public static void main(String[] args) {
		
		// Scanner input = newScanner();
		// class namme is Scanner
		// how to create an object of Scanner class?
		
		// className objectiveName = new constructorOfClass(); constructor of class name basically means same class name
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName = input.nextLine();
		System.out.println("First Name : "+firstName);
		
		System.out.println("Enter your last name");
		String lastName = input.nextLine();
		System.out.println("last : "+lastName);
		
		System.out.println("Full name :"+firstName+" "+lastName);
		
		System.out.println("Enter Course Fee");
		double cFee=input.nextDouble();
		System.out.println("Course fee is "+cFee);
		System.out.println("Enter your age");
		int age=input.nextInt();
		System.out.println("My age is "+age);
		
		//to close scanner
		
		input.close();
		
		
		
	}
	
	
	
	

}
