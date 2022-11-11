package constructor;


class cons1{
	private static int a ;
	private static int b;
	public static int getA() {
		return a;
	}
	public static int getB() {
		return b;
	}
	public cons1() {
		this(a,b);
	}
	public cons1(int a , int b) {
		this.a = 10;
		this.b = 50;
	}
//	public int add(int a , int b) {
//		return a+b;
//	}
//	public void add(int a , float b) {
//		this(a,a);
//	}
	
}
public class constructor_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        cons1 a = new cons1();
        System.out.println(a.getA());
        System.out.println(a.getB());
	}

}
