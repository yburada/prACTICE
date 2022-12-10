package MultiThreading;

class Banking extends Thread{
	synchronized public void run() {
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

class Printing extends Thread{
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

class Bluffing  extends Thread{
	
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

public class MultiT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   Banking B = new Banking();
	   Printing p = new Printing();
	   Bluffing Bf = new Bluffing();
	   
	   B.start();
	   p.start();
	   Bf.start();
	}

}
