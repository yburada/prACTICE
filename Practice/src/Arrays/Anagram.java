package Arrays;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "race";
		String s1 = "care";
		char[]	ch = s.toCharArray();
		char[]  ch1 = s1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		boolean b =Arrays.equals(ch, ch1);
		System.out.println(b);
		
        
	}

}
