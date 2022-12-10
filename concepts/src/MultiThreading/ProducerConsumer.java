package MultiThreading;

class Producer extends Thread{
	
	boolean dataEfficiency = false;
	StringBuffer sb;
	
	Producer(){
		sb = new StringBuffer();
	}
	@Override
	public void run(){
		for(int i=1;i<=10;i++) {
			
			try {
				sb.append(i+":");
				System.out.println("Data is pepearing");
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		dataEfficiency = true;
	}
	
	
}

class consumer extends Thread{
	Producer p;
	consumer(Producer p){
		this.p =p;
	}
	@Override
	public void run() {
		while(p.dataEfficiency == false) {
			try {
				System.out.println("Waiting For Data setup");
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(System.currentTimeMillis() - ProducerConsumer.d);
		System.out.println(p.sb.toString());
	}
	
}
public class ProducerConsumer {
	
	static double d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producer p = new Producer();
		consumer c = new consumer(p);
		d = System.currentTimeMillis();
		c.start();
		p.start();

	}

}
