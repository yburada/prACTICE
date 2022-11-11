package Inheritance;

class Plane{
	int a;
	public void insert(int a) {
		this.a = a;
		System.out.println("Plane  "+ a);
	}
}

class CargoPlane extends Plane{
	int a;
	public void insert(int a) {
		this.a = a;
		super.insert(a);
		System.out.println("CargoPlane  "+ a);
	}
}

class PassengerPlane extends CargoPlane{
	int a;
	public void insert(int a) {
		this.a = a;
		super.insert(a);
		System.out.println("PassengerPlane  "+ a);
	}
}
public class example_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plane p = new Plane();
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		pp.insert(10);
		System.out.println(p.a +" "+cp.a+" "+pp.a );
	}

}
