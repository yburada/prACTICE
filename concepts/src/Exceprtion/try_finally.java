package Exceprtion;

import java.util.Scanner;

public class try_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = 0;
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			c = a/b;
		}
		finally {
			System.out.println(c);
		}

	}

}
