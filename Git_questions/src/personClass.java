
class person{
	private String First_Name;
	private String Last_name;
	private int Age;
	
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	
	public void intoduce() {
		System.out.println("Hi I am "+First_Name+" "+Last_name);
		System.out.println("I am "+Age);
	}
	
}

public class personClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person p = new person();
		
		p.setFirst_Name("Yogesh");
		p.setLast_name("Burada");
		p.setAge(23);
		p.intoduce();

	}

}
