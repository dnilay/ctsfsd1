package comm.example;
import java.io.File;

public class DirectoryInfo {
    
    public static void main(String[] args) {
        
        // Create a directory
        System.out.println("Creating temp directory...");
        String fileName = "temp";
        File fn = new File(fileName);
        fn.mkdir();
        
        // Create sub directories under the temp directory
        File subdir1 = new File(fn, "subdir1");
        subdir1.mkdir();
        File subdir2 = new File(fn, "subdir2");
        subdir2.mkdir();
        
        // Check if it is a file or directory using isFile() method
        System.out.println(fileName + " is a " +
                (fn.isFile()? "file." :"directory."));   
        
        if (fn.isDirectory()) {
            String content[] = fn.list();
            System.out.println("The content of this directory:");
            for (int i = 0; i < content.length; i++) {
                System.out.println(content[i]);
            }
        }
        
        // Delete a directory
        System.out.println(fileName +
                (fn.exists()? " exists": " does not exist"));
        System.out.println("Deleting temp directory...");
        fn.delete();
        
    }
}
