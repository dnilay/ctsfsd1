package comm.example;


public class BufferedReaderWriter {
    
    public static void main(String args[]) {
        
        String a0, a1, a2;
        
        if (args.length != 3){
            a0 = "xanadu.txt";
            a1 = "wordsout.txt";
            a2 = "3";
        } else{
            a0 = args[0];
            a1 = args[1];
            a2 = args[2];
        }
        
        SimpleEncryption se = new SimpleEncryption();
        se.encrypt(a0, a1, Integer.parseInt(a2));
        
        /* print content of encrypted file */
        System.out.println("Displaying encrypted words from words.txt...");
        se.viewFileContent(a1);
        
    }
}
