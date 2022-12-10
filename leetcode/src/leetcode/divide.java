package leetcode;

public class divide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = -2147483648;
		int divisor = -1;

		if(dividend<0 && divisor<0){
			System.out.println("I am here");
			int a = (int) dividend/divisor;
			a = (int)a-1;
            System.out.println(Math.abs(a));
        }
        else{
            System.out.println((int) dividend/divisor);
        }
		
		byte b = (byte) -129;
		System.out.println(b);
		
	}

}
