
package comm.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        // Set up testing data
        String name[] = {
            new String("Sang"),
            new String("Shin"),
            new String("Boston"),
            new String("Passion"),
            new String("Shin"),
        };
        
        // Create a List object from an array
        List<String> l = Arrays.asList(name);
        System.out.println("Before shuffling = " + l);
        
        // Shuffle the list
        Collections.shuffle(l);
        System.out.println("Shuffled list = " + l);
        
        // Sort the list
        Collections.sort(l);
        System.out.println("Sorted list = " + l);
        Collections.shuffle(l);
    }
    
}
