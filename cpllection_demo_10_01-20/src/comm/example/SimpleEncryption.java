package comm.example;

import java.io.*;

class SimpleEncryption {
    
   void encrypt(String source, String dest, int shiftSize) {
       
      BufferedReader reader;
      BufferedWriter writer;
      
      try {
         reader = new BufferedReader(new FileReader(source));
         writer = new BufferedWriter(new FileWriter(dest));
         String line = reader.readLine();
         int data;
         while (line != null) {
            for (int i = 0; i < line.length(); i++) {
               data =(int) line.charAt(i) + shiftSize;
               writer.write(data);
            }
            writer.write((int)'\n');
            line = reader.readLine();
         }
         reader.close();
         writer.close();
      } catch (IOException ie) {
         System.out.println("Failed encrypting the file content.");
      }

   }
   
   void viewFileContent(String filename) {
       
      BufferedReader reader;
      try {
         reader = new BufferedReader(new FileReader(filename));
         String line = reader.readLine();
         while (line != null) {
            System.out.println(line);
            line = reader.readLine();
         }
         reader.close();
      } catch (IOException ie) {
         System.out.println("Failed to open file for reading.");
      }
   }
   
}