package comm.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DefaultStreamDemo {

	public static void main(String[] args) {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Your Name: ");
			String str=br.readLine();
			System.out.format("Name # %s", str);
			System.out.print("Your Age: ");
			int age=Integer.parseInt(br.readLine().toString());
			System.out.printf("Age # %d",age);
		} catch (IOException e) {
			
			System.err.println("i/o exception occured");
		}
		catch(NumberFormatException nfe)
		{
			System.err.println("number format exception occured");
		}
	}

}
