package leetcode;

import java.util.ArrayList;
import java.util.List;

public class paranthasys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s =")()())";
		List<String> ls =new ArrayList<>();
		int count = 0;
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i) == ')');
			if(s.charAt(i) == ')') {
				int index = ls.indexOf("(");
				System.out.println(index);
				if(index>=0) {
					System.out.println(" Iam removing (");
					count+=2;
					ls.remove(index);
				}
				System.out.println(count);
			}
			else if(s.charAt(i) == '(') {
				System.out.println("I am adding (");
				ls.add("(");
			}
		}
		System.out.println(ls);
		System.out.println(count);

	}

}
