import java.util.Scanner;

public class nCr_nPr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int res = fact(num1)/ (fact(num2) * fact(num1-num2)) ;
		System.out.println(res);
		
		res = fact(num1)/ fact(num1-num2);
		System.out.println(res);
		
	}
	static int fact(int num) {
		int res=1;
		while(num>0) {
			res*=num;
			num--;
		}
		return res;
	}

}
