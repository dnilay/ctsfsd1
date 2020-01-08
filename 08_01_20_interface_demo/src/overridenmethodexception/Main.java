
package overridenmethodexception;

public class Main extends Inning implements Storm {
   
    public Main() throws RainedOut, BaseballException {
    }
    
    public Main(String s) throws Foul, BaseballException {
    }
    
   
    public void rainHard() throws RainedOut {
    }
    
    public void event() {
    }
    
    
    public void atBat() throws PopFoul {
    }
    
    public static void main(String[] args) {
        try {
            Main si = new Main();
            si.atBat();
        } catch (PopFoul e) {
            System.err.println("Pop foul");
        } catch (RainedOut e) {
            System.err.println("Rained out");
        } catch (BaseballException e) {
            System.err.println("Generic baseball exception");
        }
       
        try {
           
            Inning i = new Main();
            i.atBat();
          
        } catch (Strike e) {
            System.err.println("Strike");
        } catch (Foul e) {
            System.err.println("Foul");
        } catch (RainedOut e) {
            System.err.println("Rained out");
        } catch (BaseballException e) {
            System.err.println("Generic baseball exception");
        }
    }
} 
