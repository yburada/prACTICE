package wrapperClasses;

import java.lang.Exception;

class Student extends Object{
	String name;
	
	Student(String name){
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
}
public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	    Exception e = new Exception();
		Student s = new Student("Yogesh");
		System.out.println(s);
	}

}
