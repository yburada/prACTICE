package Inheritance;

class meta{
  public static void disp() {
	 System.out.println("mets display");
 }
}

class face extends meta{
	public static void disp() {
		System.out.println("face disp");
	}
}

public class example_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		meta m = new face();
		m.disp();
	}

}
