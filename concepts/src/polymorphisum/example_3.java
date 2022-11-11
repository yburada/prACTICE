package polymorphisum;

class A{
	public static void met() {
		System.out.println("A class");
	}
}
class B extends A {
	public void met() {
		System.out.println("A class");
	}
}
public class example_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A b = new B();
		b.met();
	}

}
