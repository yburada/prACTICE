package Arrays;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String new_name = "";
		System.out.println(name.length());
		for(int i=name.length()-1;i>=0;i--) {
			new_name += name.charAt(i);
			//System.out.println(new_name);
		}
		
		System.out.println(new_name);
        
	}

}
