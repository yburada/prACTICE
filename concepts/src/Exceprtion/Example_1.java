package Exceprtion;

import java.util.Scanner;

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int c = a/b;
		}
		catch(Exception e) {
			System.out.println("Exception");
		}

	}

}