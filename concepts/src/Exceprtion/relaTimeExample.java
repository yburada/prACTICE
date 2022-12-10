package Exceprtion;

import java.util.Scanner;

class UserException extends Exception{
	UserException(String msg){
		super(msg);
	}
}
class ATM{
	private int accountNum = 1234;
	private int password = 4321;
	private int acc_num;
	private int pass;
	
	public void intialize() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number");
		acc_num = sc.nextInt();
		System.out.println("Enter Password");
		pass = sc.nextInt();
	}
	
	public void verify() throws UserException {
		if(acc_num == accountNum && pass == password) {
				System.out.println("Collect the cash");
			}
			else {
				throw new UserException("Invalid Credintials");
			}
	}
	
	public void running() {
		try {
			intialize();
			verify();	
		}
		catch(UserException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			try {
				intialize();
				verify();	
			}
			catch(UserException e1) {
				System.out.println(e1.getMessage());
				e1.printStackTrace();
				try {
					intialize();
					verify();	
				}
				catch(UserException e2) {
					System.out.println(e2.getMessage());
					e2.printStackTrace();
					System.exit(0);;
					
				}
			}
		}
	}
}


public class relaTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ATM a = new ATM();
		a.running();
		
	}

}
