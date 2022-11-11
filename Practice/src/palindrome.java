import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int res =0;
		while(num>0) {
			int k  = num%10;
			res*=10;
			res+=k;
			num = num/10;
		}
		System.out.println(temp +" "+res);
		System.out.println(temp==res);
	}

}
