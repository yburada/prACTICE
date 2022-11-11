package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class cubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num_c = sc.nextInt();
		int num_s = sc.nextInt();
		int sum1 =0, sum2 =0, sum3 =0;
		List<Integer> ls = new ArrayList<>();
		for(int i=0;i<num_c;i++) {
			ls.add(sc.nextInt());
		}
		Collections.sort(ls,Collections.reverseOrder());
		System.out.println(ls);
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		Stack<Integer> s3 = new Stack<>();
		s1.add(0);
		s2.add(0);
		s3.add(0);
		for(int i=0;i<ls.size();i++) {
			if(s1.lastElement()<ls.get(i)) {
				s1.add(ls.get(i));
				sum1+=ls.get(i);
				//ls.remove(i);
			}
			else if(s2.lastElement()<ls.get(i)) {
				s2.add(ls.get(i));
				sum2+=ls.get(i);
				//ls.remove(i);
			}
			else if(s3.lastElement()<ls.get(i)) {
				s3.add(ls.get(i));
				sum3+=ls.get(i);
				//ls.remove(i);
				
			}
		}
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(ls);
		if(ls.size()>0) {
			System.out.println("-1");
		}
		else {
			System.out.println(sum1+" "+sum2+" "+sum3);
		}
	}

}
