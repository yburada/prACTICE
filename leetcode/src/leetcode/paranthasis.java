package leetcode;

public class paranthasis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "(]";
		int lenght = s.length();
		while(s.length()!=0) {
			s=s.replace("()", "");
			s=s.replace("[]", "");
			s=s.replace("{}", "");
			//System.out.println(s +"   "+s.length()+ "   "+ lenght);
			if(s.length()==lenght) {
				break;
			}
			lenght = s.length();
		}
		if(s.length()==0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
