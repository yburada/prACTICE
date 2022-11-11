package implementation;

import Data.Data_calc;
import visual_class.visual;
public class segregation {

	public static double implementation(double a, double b, String s, visual v) {
		
		Data_calc da = new Data_calc();
		
		da.setA(a);
		da.setB(b, s);
		
		switch(s) {
		case "+":
			return v.add(a, b);
		case "-":
			return v.sub(a, b);
		case "/":
			return v.div(a, b);
		case "*":
			return v.mul(a, b);
		case "^":
			return v.sqrt(a);
		case "%":
			return v.percentage(a, b);
		}
		return 0;
	}
	
}
