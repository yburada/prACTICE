package password;

import java.util.Scanner;
class user{
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

public class user_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		user obj = new user();
		System.out.print("Enter the Username: ");
		obj.setUsername(sc.nextLine());
		System.out.print("Enter the Password : ");
		obj.setPassword(sc.nextLine());
		Authhonticator a = new Authhonticator();
		System.out.println(a.validate(obj.getUsername(),obj.getPassword()));
		sc.close();
	}

}

