package comm.example.thread.exam;

public class Main {

	public Main() {
	}

	public static void main(String[] a) {
		Monitor moni = new Monitor();
		
		Thread p1 = new Thread(new Producer(moni), "p1");
		Thread c1 = new Thread(new Consumer(moni), "c1");
		c1.start();
		p1.start();
		
		

	}
}
