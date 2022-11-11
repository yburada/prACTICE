package Data;

public class Data_calc {

	private double a;
	private double b;
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b, String s) {
		if(s.equals("/") && b==0)
			System.out.println("B value must be otherthan zero");
		else
			this.b = b;
	}

}
