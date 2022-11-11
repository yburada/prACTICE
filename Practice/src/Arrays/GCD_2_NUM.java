package Arrays;

import java.util.Scanner;

public class GCD_2_NUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int rem = Integer.MAX_VALUE;
		
		while(rem !=0) {
			rem = num1%num2;
			if(rem==0) {
				System.out.println("GCD is "+ num2);
			}
			else {
				num1 = num2;
				num2 = rem;
			}
		}
		
		
	}

}
