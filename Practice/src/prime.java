import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int temp =num;
		num = (int) Math.sqrt(num);
		System.out.println(num);
		boolean b = true;
		for(int i=2;i<=num;i++) {
			if(temp%i==0) {
				b= false;
			}
		}
		System.out.println(b);

	}

}
