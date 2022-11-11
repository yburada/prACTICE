package staticConcept;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main block");
		disp();
	}
	static {
		
		System.out.println("static block");
	}
	static void disp() {
		System.out.println("static method");
	}

}
