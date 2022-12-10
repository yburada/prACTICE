package Exceprtion;

import java.util.Scanner;

class retur_n{
	Scanner sc = new Scanner(System.in);
	
	public int display(){
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			return a;
		}
		catch(ArithmeticException e) {
			System.out.println("Handiling exception");
		}
		
		finally {
			System.out.println("Finally block Excecuted");
		}
		return 0;		
	}	
}

public class return_EXP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Finally block executed
		
		retur_n r = new retur_n();
		System.out.println(r.display());

	}

}
