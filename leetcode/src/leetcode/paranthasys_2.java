package leetcode;

public class paranthasys_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "([)]";
		int count =0;
		for(char ch : s.toCharArray()) {
			if(ch == '(')
				count++;
			else if(ch=='[')
				count+=2;
			else if(ch=='{')
				count+=3;
			else if(ch==')')
				count--;
			else if(ch==']')
				count-=2;
			else
				count-=3;			
		}
		if(count ==0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
