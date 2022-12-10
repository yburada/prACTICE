
public class chumma {
	static int a =10;
	static 
	{
		System.out.println("I am in static block");
		System.out.println(a);
	}


	{
		System.out.println("I am in default block");
	}
	
	public void hello() {
		System.out.println("I am in a Normal method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("I am in static method");
		
		chumma ch = new chumma();
		ch.hello();
	}

}
