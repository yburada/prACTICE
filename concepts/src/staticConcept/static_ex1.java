package staticConcept;

class Employee{
	int em_no;
	String name;
	static String ceo;
	public Employee(int em_no, String name, String ceo) {
		this.em_no = em_no;
		this.name = name;
		this.ceo = ceo;
	}
}
public class static_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee a = new Employee(1,"yogesh","havi");
		System.out.println(a.em_no+" "+a.name+" "+ a.ceo);
		Employee b = new Employee(1,"venghaya","Madhu");
		System.out.println(b.em_no+" "+b.name+" "+ b.ceo);
		System.out.println(a.em_no+" "+a.name+" "+ a.ceo);
	}

}
