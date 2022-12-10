package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class paranthasys2 {

	public static void main(String[] args) {
		
		String s ="(()";
		Stack<Character> st = new Stack<>();
		List<Integer> ls = new ArrayList<>();
		int count =0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)== '(') {
				if(i>0) {
					if(s.charAt(i-1)== ')'){
	                    ls.add(count);
	                    count =0;

	                }
				}
				System.out.println(i+" "+"I am 1st");
				st.add(s.charAt(i));
			}
			else {
				System.out.println(i+" "+"I am 2nd");
				if(st.isEmpty()) {
					st.push('!');
					continue;
				}
				else {
					if(i>0) {
						System.out.println("adding list");
						System.out.println(s.charAt(i-1)== ')');
						System.out.println(i+" "+"I am 3rd" + count);
						if(s.charAt(i-1)== ')'){
							System.out.println("adding list");
		                    ls.add(count);
		                    count =0;

		                }
					}
				//	System.out.println(st);
					char c = st.pop();
//					System.out.println(st);
//					System.out.println(c=='(');
//					System.out.println(st.size());
					if(c=='(') {
						System.out.println("I am here");
						count+=2;
					}
				}
			}
		}
		System.out.println(ls);
		int max =0;
		int s1 =0;
		for(int i=0;i<ls.size();i++) {
			if(i>0 && ls.get(i)==0) {
				max = max>s1 ? max:s1;
				s1=0;
			}
			else {
				s1+=ls.get(i);
			}
		}
		System.out.println(max);

	}

}
