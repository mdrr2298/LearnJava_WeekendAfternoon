package basic;

public class LearnStatic {
	
	// Declare Variable: declare data type with variable name 
	int age;
	// Declare variable and assing value
	int pizzaPrice = 25;
	

	public static String stName="Rafi";	// static global variable - key word - no need object creation
	String stAddress="New York"; // non static global variable
	
	static String stFatherName;
	
	public static void tvDisplay() {
		System.out.println("TV Display is UHD");
		
	}
	
	public void display() {
		
		System.out.println("Display is good");
	}
	
	public static void main(String[] args) {
		
		//How to call a non static variable inside main method?
	    // Static variable is call by class name as that variable is in class level
		
		String stPhoneNumber="76787989889"; // Local Variable
		
		LearnStatic.stName="Khalid"; // Resign value - from Rafi to Khalid
		System.out.println(LearnStatic.stName);
		LearnStatic.tvDisplay();
		LearnStatic.stFatherName="Bob Williams";
		System.out.println("Student father name is "+LearnStatic.stFatherName);
				
		
		// How to call non static variable insdie main method
		// to call a non static variable n method we need to create object then -
		//-call by object name 
		
		//How to create an object
		// className objectname = new constructorOfClass();
		
		LearnStatic obj = new LearnStatic();
		//obj.stAddress;
		System.out.println(obj.stAddress);
		obj.age=34;
		System.out.println(obj.age);
		obj.pizzaPrice=45;
		System.out.println("Pizza Price "+obj.pizzaPrice);
		obj.display(); //call by object name
		
	}
	
	
	
	
	
	
	
	
}
