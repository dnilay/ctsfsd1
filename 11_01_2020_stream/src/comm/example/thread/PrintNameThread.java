package comm.example.thread;


public class PrintNameThread implements Runnable {
    
    Thread thread;
    
    PrintNameThread(String name) {
        thread = new Thread(this, name);
        thread.start();
    }
    
    public void run() {
        String name = thread.getName();
        for (int i = 0; i < 10; i++) {
            System.out.print(name);
        }
    }
    
}
