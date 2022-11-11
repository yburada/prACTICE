package constructor;

class Alien{
	static int m;
	static int n;
	static int k;
	public Alien() {
		this(m,n,k);
		m=10;
		n= 20;
		k=m+n;
		System.out.println("Alien");
	}
	public Alien(int a, int b) {
		this();
		k= a+b;
		System.out.println("para Alien");
	}
	public Alien(int a, int b, int c) {
		k =a+b+c;
	}
	
}
public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alien a = new Alien();
	}

}
