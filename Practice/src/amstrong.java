import java.util.Scanner;

public class amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int temp = num;
		int pow =0;
		int total =0;
		
		if(num >=0 && num<10) {
			pow =1;
		}
		else if(num>=10 && num <100) {
			pow =2;
		}
		else {
			pow =3;
		}
		System.out.println(pow);
		while(num>0) {
			int k = num%10;
			total+= Math.pow(k, pow);
			num =num/10;
		}
		System.out.println(temp+" "+ total);
		System.out.println(temp == total);
	}

}
