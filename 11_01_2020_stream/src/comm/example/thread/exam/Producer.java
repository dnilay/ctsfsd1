package comm.example.thread.exam;

import java.util.Date;
import java.util.Random;

public class Producer implements Runnable {
	private Monitor monitor;

	public Producer(Monitor m) {
		monitor = m;
	}

	public void run() {
		Random rand = new Random();
		for (int i = 0; i < 3; i++) {
			monitor.put(new Date());
			System.out.format("Producer %d put the time %s%n", i, Monitor.datum);
			try {
				Thread.sleep(rand.nextInt(5000));
			} catch (InterruptedException e) {
			}
		}
	}
}
