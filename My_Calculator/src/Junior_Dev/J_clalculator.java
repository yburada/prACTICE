package Junior_Dev;

import visual_class.visual;

public class J_clalculator implements visual {

	@Override
	public double add(double a, double b) {
		
		double c= a+b;
		return c;
	}

	@Override
	public double sub(double a, double b) {
		double c= a-b;
		return c;
	}

	@Override
	public double mul(double a, double b) {
		double c = a*b;
		return c;
	}

	@Override
	public double div(double a, double b) {
		double c= a/b;
		return c;
	}

	@Override
	public double sqrt(double a) {
		double c = Math.sqrt(a);
		return c;
	}

	@Override
	public double percentage(double a, double b) {
		double c = (a*b)/100;
		return c;
	}

}
