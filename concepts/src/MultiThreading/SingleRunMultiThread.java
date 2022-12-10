package MultiThreading;
class Demo7 extends Thread{
	synchronized public void run() {
		String s = Thread.currentThread().getName();
		
		if(s.equals("Demo4")) {
			Demo4();
		}
		else if(s.equals("Demo5")) {
			Demo5();
		}
		else {
			Demo6();
		}
	}
	public void Demo4() {
		for(int i=0;i<3;i++) {
			System.out.println("havishya");
			try {
				System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void Demo5() {
		for(int i=0;i<3;i++) {
			System.out.println("Yogesh");
			try {
				System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void Demo6() {
		for(int i=0;i<3;i++) {
			System.out.println("Love");
			try {
				System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class SingleRunMultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo7 d1 = new Demo7();
		Demo7 d2 = new Demo7();
		Demo7 d3 = new Demo7();
		
		
		d1.setName("Demo4");
		d2.setName("Demo5");
		d3.setName("Demo6");
		
		d1.start();
		
		d2.start();
		
		d3.start();
		
	}

}
