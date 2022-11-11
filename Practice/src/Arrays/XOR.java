package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XOR {
	
	public static int solve(int N , List<Integer> A,List<Integer> B ) {
		int total=1;
		for(int i=0;i<N;i++) {
			int sum = A.get(i) ^ B.get(i);
			if(i==0) {
				total =sum;
			}
			total = total & sum;
		}
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();
		
		for(int i=0;i<N;i++) {
			A.add(sc.nextInt());
		}
		for(int i=0;i<N;i++) {
			B.add(sc.nextInt());
		}
		int a = solve(N,A,B);
		System.out.println(a);
	}

}
