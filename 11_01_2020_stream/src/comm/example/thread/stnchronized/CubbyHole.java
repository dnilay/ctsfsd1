package comm.example.thread.stnchronized;

public class CubbyHole {

    private int contents;
    private boolean available = false;

   
    public synchronized int get(int who) {
        while (available == false) {   
            try {
                wait();              
            } catch (InterruptedException e) { }
        }
        
        available = false;             
        System.out.format("Consumer %d got: %d%n", who, contents);

    
        notifyAll();                   
        return contents;
        
    }

   
    public synchronized void put(int who, int value) {
        while (available == true) { 
            try {
                wait();             
            } catch (InterruptedException e) { }
        }

        
        contents = value;
        available = true;
        System.out.format("Producer %d put: %d%n", who, contents);
        notifyAll();
    }
}
