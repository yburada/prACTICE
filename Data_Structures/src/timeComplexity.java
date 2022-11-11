
public class timeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double currentTime = System.currentTimeMillis();
		int sum =timeComplexity.firstWay(99999);
		System.out.println(System.currentTimeMillis()-currentTime);
		System.out.println(sum);


	}
	public static int firstWay(int n) {
		return n*(n+1)/2;
	}
	public static int secondWay(int n) {
		int sum =0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}

}
