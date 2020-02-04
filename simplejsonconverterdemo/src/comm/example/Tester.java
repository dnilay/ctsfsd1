package comm.example;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Tester {

	public static void main(String[] args) {
		try {
			ObjectMapper mapper=new ObjectMapper();
			
			  Student s=mapper.readValue(new File("student.json"), Student.class);
			  System.out.println(s);
			 
			/*
			 * Student s =new Student(2,"Marry","Rossi",true); String
			 * s1=mapper.writeValueAsString(s); System.out.println(s1);
			 */
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
