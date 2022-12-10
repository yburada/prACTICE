import java.util.Arrays;

public class charecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println((char) (1+65));
		
		int[] a = new int[10];
		a[0]=10;
		a[1]=20;
		
		int[] b =Arrays.copyOf(a,15 );
		
		System.out.println(b.length);
		
		int[] c = {1,2,3,4,5,6};
		System.out.println(c.length);
		c=Arrays.copyOf(c, c.length+1);
		
		int index = 3;
		int insert = 10;
		System.out.println(c.length);
		for(int i=c.length-1;i>=0;i--) {
			if(i==index) {
				c[i] = insert;
				break;
			}
			else {
				System.out.println(" I am here");
				c[i] = c[i-1];
			}
		}
		
		for(int c1:c) {
			System.out.println(c1);
		}
	}

}
