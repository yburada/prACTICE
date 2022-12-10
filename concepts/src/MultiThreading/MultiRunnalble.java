package MultiThreading;
class Demo1 implements Runnable{
	synchronized public void run() {
		System.out.println(Thread.currentThread().getName()+"I am thread here");
		for(int i=0;i<3;i++) {
			System.out.println("havishya");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Demo2 implements Runnable{
	synchronized public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("Yogesh");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Demo3  implements Runnable{
	
	synchronized public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("Love");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class MultiRunnalble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating thread using runnable interface
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		
		Thread t1 = new Thread(d1,"local");
		Thread t2 = new Thread(d2);
		Thread t3 = new Thread(d3);
		
		t1.start();
		t2.start();
		t3.start();
		
		System.gc();
		

	}

}
