package Inheritance;


// for every constructor there is a default super() method

class A{
	public A() {
		System.out.println("A con");
	}
	public A(int a, int b) {
		System.out.println("A con 1");
	}
}
class B extends A{
	public B() {
		System.out.println(" B Con");
	}

	public B(int i, int j) {
		// TODO Auto-generated constructor stub
		super(i,j);  /// most important line
		System.out.println("B con 1");
	}
}
public class example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B(2,3);
		
	}

}