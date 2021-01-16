package basic;

public class LearnObject {
	
	//How to create a object
	// className objectname = new constructorOfClass();
	
	int num1=34;
	int num2=45;

	public static void main (String [] args) {
		LearnObject learn= new LearnObject();
		
		int total= learn.num1+learn.num2; // call by object name
		System.out.println("Total value is "+total);
		
		// can we create multiple objects of same class?
		LearnObject obj=new LearnObject();
		obj.num1=66;
		obj.num2=78;
		int output=obj.num1*obj.num2;
		System.out.println("Output is "+output);
		
		// can we create another class object here? yes
		LearnDataType dataType = new LearnDataType();
		//dataType.courseFee 
		System.out.println(dataType.courseFee);
		dataType.isAvailable= false; // reassinging value
		System.out.println(dataType.isAvailable);
		
		LearnStatic Is=new LearnStatic();
		Is.display();
		LearnStatic.tvDisplay();
		
		
	}
	
	
	
	
	
	
	
	
	

}
