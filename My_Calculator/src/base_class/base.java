package base_class;

import java.util.Scanner;

import visual_class.visual;

import Seniour_Dev.S_claculator;
import implementation.segregation;
import Junior_Dev.J_clalculator;

public class base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Value: ");
		double a = sc.nextDouble();
		System.out.println();
		
		System.out.print("Enter b Value: ");
		double b = sc.nextDouble();
		System.out.println();
		
		System.out.print("Enter the operation: ");
		String s = sc.next();
		System.out.println();
		
		System.out.print("Choose one option calc below \n1. Senior calc\n2. Junior calc\n");
		int calc = sc.nextInt();
		sc.close();
		visual v;
		if(calc == 1) {
			v = new S_claculator();
		}
		else {
			v = new J_clalculator();
		}
		
		double res = segregation.implementation(a, b, s, v);
		
		System.out.println(res);

	}

}
