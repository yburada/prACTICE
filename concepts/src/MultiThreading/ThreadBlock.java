package MultiThreading;

class Print implements Runnable{
	
	 public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println(i);
			}
			Thread.sleep(2000);
			
			synchronized(this) {
			for(int i=0;i<5;i++) {
				System.out.println((char)(i+65));
			}
			Thread.sleep(2000);
			}
			
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
	}
}
public class ThreadBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print p = new Print();
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(p);
		
		
		t1.start();
		t2.start();
		t3.start();

	}

}
