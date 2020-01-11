package comm.example.thread;

public class PrintNameRunnable implements Runnable {
    
    Thread thread;
    
    PrintNameRunnable(String name) {
        thread = new Thread(this, name);
        thread.start();
    }
    
 
    public void run() {
        String name = thread.getName();
        for (int i = 0; i < 20; i++) {
        	
            System.out.println(name);
            System.out.println("Thread Name Is: "+thread.getName()+" Thread id: "+thread.getId());
        }
    }
}