import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class distinct {
	
	
	public static int solve(int N, List<Integer> A) {
		Set<Integer> s = new HashSet<>();
		s.addAll(A);
		
		return s.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> A = new ArrayList<>();
		for(int i=0;i<N;i++) {
			A.add(sc.nextInt());
		}
		int res = solve(N, A);
		
		System.out.println(res);
	}

}
