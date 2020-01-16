package comm.example.h2.connection.factory;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleLoggingExample {
    
    // A Logger object is used to log messages for a specific system
    // or application component. Loggers are normally named, using a
    // hierarchical dot-separated namespace. Logger names can be arbitrary
    // strings, but they should normally be based on the package name or
    // class name of the logged component. In addition it is possible
    // to create "anonymous" Loggers that are not stored in the Logger
    // namespace.
    private static Logger logger = Logger.getLogger("a");
    
    public static void main(String[] args) {
        // Log a INFO tracing message
        logger.info("doing stuff");
        
        try{
            System.out.println(3/0);
        } catch(Exception e){
            logger.log(Level.SEVERE,"dividing by 0");
        }
        
        logger.info("done");
    }
    
}
