package polymorphisum;


// Using static we can achieve method hiding
class Plane{
	public static void fly() {
		System.out.println("plane can fly");
	}
	public static void takeOff() {
		System.out.println("flight taken Off");
	}
}

class CargoPlane extends Plane{
	
	// this is not the inherited method this is specialized method. Using static we can achieve method hiding
	public static void fly() {
		System.out.println("Cargo plane can fly");
	}
	public static void takeOff() {
		System.out.println("Cargo flight taken Off");
	}
}

class PassengerPlane extends Plane{
	public static void fly() {
		System.out.println("Passenger plane can fly");
	}
	public static void takeOff() {
		System.out.println("Passenger flight taken Off");
	}
}

public class methos_hiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plane p = new CargoPlane();
		p.fly();
		p.takeOff();
		
		Plane p1 = new PassengerPlane();
		p1.fly();
		p1.takeOff();
		
	}

}
