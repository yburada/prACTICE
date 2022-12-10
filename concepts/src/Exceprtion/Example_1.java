package Exceprtion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Example_1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int c = a/b;
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
		
		try(BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\yburada\\eclipse-workspace\\concepts\\practice"))){
			int i;
			while((i=bf.read())!=-1) {
				System.out.println(bf.readLine());
			}
		}

	}

}
