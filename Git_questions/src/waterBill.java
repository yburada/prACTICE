import java.util.Scanner;

public class waterBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		final double minimum_Charge = 18.84;
		
		System.out.println("Enter the number of gallons used: ");
		
		int gallons = sc.nextInt();
		
		if(gallons >1496) {
			double CCF = (double)gallons/748;
			System.out.println(CCF);
			CCF-=1;
			CCF = (int)CCF;
			System.out.println(CCF);
			System.out.println(18.84+(CCF*3.90));
		}
		else {
			System.out.println("charge: $18.84");
		}

	}

}
