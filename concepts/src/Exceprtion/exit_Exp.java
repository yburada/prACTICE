package Exceprtion;

import java.util.Scanner;

class retur_n1{
	Scanner sc = new Scanner(System.in);
	
	public void display(){
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Hi");
			System.exit(0);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Handiling exception");
		}
		
		finally {
			System.out.println("Finally block Excecuted");
		}
		
	}	
}


public class exit_Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// finally block not executed
		
		retur_n1 r = new retur_n1();
		r.display();

	}

}
