package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_full {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		ch1 = Anagram_full.sort(ch1);
		ch2 = Anagram_full.sort(ch2);
		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));

	}
	public static char[] sort(char[] ch) {
		//System.out.println("hi");
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[j]<ch[i]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return ch;
		
	}

}
