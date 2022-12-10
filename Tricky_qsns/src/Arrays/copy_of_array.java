package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class copy_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * output is :
		 * arr: [100, 2, 3, 4, 5]
         *  p: [100, 2, 3, 4, 5]
         *  Because arr and p holds the same address
		 * 
		 */
		
		int[] arr = new int[] {1,2,3,4,5};
		
		int[] p = arr;
		
		arr[0]= 100;
		
		String s1 = "yogesh";
		String s2 = s1;
		
		System.out.println("arr: "+Arrays.toString(arr));
		System.out.println("p: "+Arrays.toString(p));

	}

}
