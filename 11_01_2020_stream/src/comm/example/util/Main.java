package comm.example.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date now = new Date();

        System.out.println(" 1. " + now.toString());

        System.out.println(" 2. " + SimpleDateFormat.getInstance().format(now));

      
        System.out.println(" 3. " + SimpleDateFormat.getTimeInstance().format(now));
        System.out.println(" 4. " +
            SimpleDateFormat.getDateTimeInstance().format(now));

        System.out.println(" 5. " +
            SimpleDateFormat.getTimeInstance(SimpleDateFormat.SHORT).format(now));
        System.out.println(" 6. " +
            SimpleDateFormat.getTimeInstance(SimpleDateFormat.MEDIUM).format(now));
        System.out.println(" 7. " +
            SimpleDateFormat.getTimeInstance(SimpleDateFormat.LONG).format(now));

        System.out.println(" 8. " + SimpleDateFormat.getDateTimeInstance(
            SimpleDateFormat.SHORT, SimpleDateFormat.SHORT).format(now));
        System.out.println(" 9. " + SimpleDateFormat.getDateTimeInstance(
            SimpleDateFormat.MEDIUM, SimpleDateFormat.SHORT).format(now));
        System.out.println("10. " + SimpleDateFormat.getDateTimeInstance(
            SimpleDateFormat.LONG, SimpleDateFormat.LONG).format(now));

    }
}
