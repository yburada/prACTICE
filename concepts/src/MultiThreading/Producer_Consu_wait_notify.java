package MultiThreading;

class Producer1 extends Thread{
	
	StringBuffer sb;
	
	Producer1(){
		sb = new StringBuffer();
	}
	@Override
	public void run(){
		synchronized(sb) {
			for(int i=1;i<=10;i++) {
				
				try {
					sb.append(i+":");
					System.out.println("Data is pepearing");
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			sb.notify();
		}
		
	}
	
	
}

class consumer1 extends Thread{
	Producer1 p;
	consumer1(Producer1 p){
		this.p =p;
	}
	@Override
	public void run() {
		synchronized(p.sb) {
			try {
				System.out.println("Waiting for data to prepare");
				p.sb.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(System.currentTimeMillis() - Producer_Consu_wait_notify.d);
		System.out.println(p.sb.toString());
	}
	
}
public class Producer_Consu_wait_notify {

	static double d;
	public static void main(String[] args) {
		
		Producer1 p = new Producer1();
		
		consumer1 c = new consumer1(p);
		d = System.currentTimeMillis();
		c.start();
		p.start();
		
		
		
		

	}

}
