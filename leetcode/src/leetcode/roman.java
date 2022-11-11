package leetcode;
import java.util.Scanner;

public class roman {
	static int sum =0;
	public static String ones(String s) 
	{
		switch(s) {
		case "I":
			sum+=1;
			break;
		case "II":
			sum+=2;
			break;
		case "III":
			sum+=3;
			break;
		case "IV":
			sum+=4;
			break;
		case "V":
			sum+=5;
			break;
		case "VI":
			sum+=6;
			break;
		case "VII":
			sum+=7;
			break;
		case "VIII":
			sum+=8;
			break;
		case "IX":
			sum+=9;
			break;
		}
		return "";
	}
	public static String tens(String s) {
		if(s.startsWith("XC")) {
			sum+=90;
			return s.substring(2,s.length());
		}
		else if(s.startsWith("XL")) {
			sum+=40;
			return s.substring(2,s.length());
		}
		else if(s.startsWith("XXX")) {
			sum+=30;
			return s.substring(3,s.length());
		}
		else if(s.startsWith("XX")) {
			sum+=20;
			return s.substring(2,s.length());
		}
		else {
			sum+=10;
			return s.substring(1,s.length());
		}
		
	}
	public static String fifty(String s) {
		if(s.startsWith("LXXX")) {
			sum+=80;
			return s.substring(4,s.length());
		}
		else if(s.startsWith("LXX")) {
			sum+=70;
			return s.substring(3,s.length());
		}
		else if(s.startsWith("LX")) {
			sum+=60;
			return s.substring(2,s.length());
		}
		else {
			sum+=50;
			return s.substring(1,s.length());
		}
	}
	public static String hundred(String s) {
		if(s.startsWith("CM")) {
			sum+=900;
			return s.substring(2,s.length());
		}
		else if(s.startsWith("CD")) {
			sum+=400;
			return s.substring(2,s.length());
		}
		else if(s.startsWith("CCC")) {
			sum+=300;
			return s.substring(3,s.length());
		}
		else if(s.startsWith("CC")) {
			sum+=200;
			return s.substring(2,s.length());
		}
		else {
			sum+=100;
			return s.substring(1,s.length());
		}
	}
	public static String fivehundred(String s) {
		if(s.startsWith("DCCC")) {
			sum+=800;
			return s.substring(4,s.length());
		}
		else if(s.startsWith("DCC")) {
			sum+=700;
			return s.substring(3,s.length());
		}
		else if(s.startsWith("DC")) {
			sum+=600;
			return s.substring(2,s.length());
		}
		else {
			sum+=500;
			return s.substring(1,s.length());
		}
	}
	public static String thoushand(String s) 
	{
		sum+=1000;
		return s.substring(1,s.length());
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//System.out.println(s.charAt(0));
		while(s.length()>0) {
			switch(s.charAt(0)) 
			{
				case 'M':
					s=thoushand(s);
					break;
				case 'D':
					s=fivehundred(s);
					break;
				case 'C':
					s=hundred(s);
					break;
				case 'L':
					s=fifty(s);
					break;
				case 'X':
					s=tens(s);
					break;
				default :
					s=ones(s);
					break;
			}
		}
		System.out.println(sum);
	}

}
