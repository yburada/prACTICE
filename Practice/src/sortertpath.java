import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sortertpath {

	static List<Integer> ls = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a=calc(N);
		System.out.println(ls);
	}
	static int calc(int N){
		System.out.println(N);
		if(N==0) {
			return 0;
		}
		else if(N>=2000){
        	System.out.println("here 2000");
            ls.add(2000);
            N=N-2000;
            calc(N);
        }
		else if(N>=500){
        	System.out.println("here 500");
            ls.add(500);
            N=N-500;
            calc(N);
        }
		else if(N>=200){
        	System.out.println("here 200");
            ls.add(200);
            N=N-200;
            calc(N);
        }
		else if(N>=100){
        	System.out.println("here 100");
            ls.add(100);
            N=N-100;
            calc(N);
        }
		else if(N>=50){
        	System.out.println("here 50");
            ls.add(50);
            N=N-50;
            calc(N);
        }
		else if(N>=20){
        	System.out.println("here 20");
            ls.add(20);
            N=N-20;
            calc(N);
        }
		else if(N>=10){
        	System.out.println("here 10");
            ls.add(10);
            N=N-10;
            calc(N);
        }
		else if(N>=5){
        	System.out.println("here 5");
            ls.add(5);
            N=N-5;
            calc(N);
        }
		else if(N>=2){
        	System.out.println("here 2");
            ls.add(2);
            N=N-2;
            calc(N);
        }
		else if(N>=1){
        	System.out.println("here 1");
            ls.add(1);
            N=N-1;
            calc(N);
        }
        return 0;
}

}
