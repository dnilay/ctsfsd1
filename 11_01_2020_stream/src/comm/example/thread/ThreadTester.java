package comm.example.thread;

public class ThreadTester {

	public static void main(String[] args) {
		SimpleThreadDemo demo=new SimpleThreadDemo();
		Thread thread1=new Thread(demo);
		Thread thread2=new Thread(demo);
		Thread thread3=new Thread(demo);
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
