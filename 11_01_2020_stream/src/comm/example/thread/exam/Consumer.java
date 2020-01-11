package comm.example.thread.exam;

import java.util.Random;

public class Consumer implements Runnable {

	private Monitor monitor;

	public Consumer(Monitor m) {
		monitor = m;
	}

	public void run() {
		Random r = new Random();

		for (int i = 0; i < 3; i++) {

			System.out.format("Consumer %d got the time :  %s%n", i, monitor.get());

			try {
				Thread.sleep(r.nextInt(5000));
			} catch (InterruptedException e) {

			}

		}

	}

}
