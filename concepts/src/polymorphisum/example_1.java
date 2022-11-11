package polymorphisum;

class Animal{
	public void eat() {
		System.out.println("Eats food");
	}
	public void sleep() {
		System.out.println("Sleeps well");
	}
}

class Tiger extends Animal{
	public void eat() {
		System.out.println("Tiger eats NON-VEG");
	}
	public void sleep() {
		System.out.println("Tiger is sleeping");
	}
}

class Monkey extends Animal{
	public void eat() {
		System.out.println("Monkey eats VEG");
	}
	public void sleep() {
		System.out.println("Monkey is sleeping");
	}
}

class Dear extends Animal{
	public void eat() {
		System.out.println("Dear eats grass");
	}
	public void sleep() {
		System.out.println("Dear is sleeping");
	}
}

class Display{
	// Animal which is an interface (main reason of polymorphisum
	public void show(Animal a) {
		a.eat();
		a.sleep();
	}
}

public class example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal t = new Tiger();
		Animal m = new Monkey();
		Animal d1 = new Dear();
		// The ways of using similar methods in different ways is called polymorphysum... 1:M -> 1 to many
		Display d = new Display();
		d.show(t);
		d.show(m);
		d.show(d1);
	}

}
