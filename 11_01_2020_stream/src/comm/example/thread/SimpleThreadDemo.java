package comm.example.thread;

public class SimpleThreadDemo implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<20;i++)
		{
			System.out.format(" %d",i);
		}
		
	}

}
