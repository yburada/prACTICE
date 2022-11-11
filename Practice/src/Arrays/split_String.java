package Arrays;

import java.util.Scanner;

public class split_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		String s1 ="";
		for(int i=0;i<arr.length;i++) {
			s1+= split_String.reverse(arr[i])+" ";
		}
		System.out.println(s1);

	}
	public static String reverse(String s) {
		String n ="";
		for(int i= s.length()-1;i>=0;i--) {
			n+=s.charAt(i);
		}
		return n;
	}

}
