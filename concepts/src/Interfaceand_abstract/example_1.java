package Interfaceand_abstract;

interface Human{
	default void see() {
		System.out.println("Human can see");
	}
}

abstract class mam{
	
	abstract void see() ;
	
}
class child extends mam{
	void see() {
		System.out.println("child can see");
	}
}
class man implements Human{
	public void see() {
		System.out.println("Man can see");
	}
}
public class example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human h = new man();
		h.see();
		mam m = new child();
		m.see();
	}

}
