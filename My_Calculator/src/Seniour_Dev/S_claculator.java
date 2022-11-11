package Seniour_Dev;

import visual_class.visual;

public class S_claculator implements visual  {

	@Override
	public double add(double a, double b) {
		return a+b;
	}

	@Override
	public double sub(double a, double b) {
		return a-b;
	}

	@Override
	public double mul(double a, double b) {
		return a*b;
	}

	@Override
	public double div(double a, double b) {
		return a/b;
	}

	@Override
	public double sqrt(double a) {
		return Math.sqrt(a);
	}

	@Override
	public double percentage(double a, double b) {
		return (a*b)/100;
	}

}
