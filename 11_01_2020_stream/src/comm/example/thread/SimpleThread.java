package comm.example.thread;


public class SimpleThread extends Thread {
    
    public SimpleThread(String str) {
        super(str);
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName() 
                                 + " Priority = " + getPriority());
        }
        System.out.println("Done! " + getName());
    }
}
