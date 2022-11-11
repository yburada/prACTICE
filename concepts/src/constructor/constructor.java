package constructor;

class cons{
	cons(int i){
		System.out.println(i+" constructor");
	}
	cons(String s){
		System.out.println(s+" constructor");
	}
}
public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cons c = new cons("yogesh");
	}

}
