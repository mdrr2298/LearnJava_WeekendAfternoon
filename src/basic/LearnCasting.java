package basic;

public class LearnCasting {
	
	// Casting: converting data type
	//Primitive DataType to Primitive DataType
	//Non primitive to Non primitive
	
	public static void main (String[] args) {
		
		double price = 35.99;
		int discountPrice = (int) price;
		System.out.println(discountPrice);
		
		int num1=50;
		int num2=40;
		int num3=num1;
		int num4= num3+ num2;
		System.out.println("Total is "+ num4);
		
		int age= 22;
		double newAge = (double) age;
		System.out.println(newAge);
		
		int number = 56;
		byte total = (byte) number;
		System.out.println("byte "+total);
		
		String name="Arafat";
		String stName=name;
		String ssn="1234";
		int newSsn=Integer.parseInt(ssn);
		System.out.println(newSsn);
		int newSsn1=Integer.valueOf(ssn);
		
		int salary=2500;
		String s=String.valueOf(salary);
		
		
		//int is dataType
		//Integer is class (class name starts with upper case)
		
		
		
		
		
		
		
	}
	
	
	

}
