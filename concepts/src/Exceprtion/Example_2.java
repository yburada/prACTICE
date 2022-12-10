package Exceprtion;

import java.util.Scanner;

public class Example_2 {

	public static void main(String[] args) {
		/*
		 * Exception :  An unwanted event that Abnormal Termination of a program
		 * Two types of Exceptions :
		 * 1. Checked Exception : Causes at Compile Time only -> throws -> file Handling
		 * 2. Unchecked Exception : Causes at RunTime only -> logic error 100/0...
		 * 3. Throw keyword -> It is used to tell the exception occurred in parent method to the caller.
		 * 
		 * Exception : throw, throws, try/catch, finally
		 * 
		 * finally -> what ever happens finally block will execute compulsory.
		 * 
		 * return < finally -> finally will execute even if the program is returned before finally block.
		 * finally < System.exit(0); -> finally will not execute after the exit function
		 */
		
		Scanner sc = new Scanner(System.in);
		
		try {
		int a = sc.nextInt();
		int b = sc.nextInt();
		new String("sachin").substring(0,3);
		int c = a/b;
		System.out.println("After the Exception");
		throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			System.out.println("Handled Exception");
		}
		finally {
			System.out.println("Finally");
		}
	}

}
