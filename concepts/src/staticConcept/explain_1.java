package staticConcept;

public class explain_1 {
	
	// Execution of the programmed 
	// The memory of the static variable and the static block is allocated at class loader time
	static int Age  = 10;
	static String name ="xxxx";
	// Static block
	static
	{
		System.out.println("Static block started");
		System.out.println("Static block age: "+Age+"   Static block name: "+name);
		Age = 50;
		name = "helsenki";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main method started");
		System.out.println("Main method age: "+Age+"   Main method name: "+name);
	}

}
