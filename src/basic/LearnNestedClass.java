package basic;

import basic.LearnNestedClass.Computer.Mobile;

public class LearnNestedClass {

	// Nested Class/ child class
	
	int num=20;
	int num1=30;
	
	public static void main(String[] args) {
		LearnNestedClass learn=new LearnNestedClass();
		System.out.println(learn.num);
		
		Computer com=new Computer();
		System.out.println(com.computerName);
		System.out.println(Computer.computerPrice);
		Computer.computerDisplay();
		
		Computer.Mobile mobile =new Mobile();
		System.out.println(mobile.mobilePrice);
		
		System.out.println(Computer.Mobile.mobileBrand);
		
		
		
		
	}
	
	public static class Computer{
		
		String computerName="HP";
		static String computerPrice="2000";
		
		public static void computerDisplay() {
			System.out.println("Computer Display");
		}
		
		
		public static class Mobile{
			static String mobileBrand="Iphone";
			int mobilePrice=1200;
			
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
