package comm.example.thread;


public class JoinTest {
    

    public JoinTest() {
    }
    
  
    public static void main(String[] args) {
        
        PrintNameThread pnt1 = new PrintNameThread("A");
        PrintNameThread pnt2 = new PrintNameThread("B");
        PrintNameThread pnt3 = new PrintNameThread("C");
        
        System.out.println("Running threads...");
        try {
            pnt1.thread.join();
            pnt2.thread.join();
            pnt3.thread.join();
        } catch (InterruptedException ie) {
        }
        System.out.println("Threads killed.");
        
    }
    
}
