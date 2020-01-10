package comm.example;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ObjectInputOutputStream {

	
	public static void main(String[] args) {
		BufferedReader reader;
		
		ToDo myToDo = null;
		List<ToDo> list = new ArrayList<ToDo>();
		try {
			reader = new BufferedReader(new FileReader("todo.in"));

			String line = reader.readLine();
			while (line != null) {
				String str[] = line.split(",");
				myToDo = new ToDo(str[0], str[1], LocalDate.now());
				System.out.println("ToDo to write is: " + myToDo);
				list.add(myToDo);
				line = reader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			FileOutputStream out = new FileOutputStream("todo.out");
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(list);
			oos.flush();
		} catch (Exception e) {
			System.out.println("Problem serializing: " + e);
		}

		try {
			FileInputStream in = new FileInputStream("todo.out");
			ObjectInputStream ois = new ObjectInputStream(in);
			list = (List<ToDo>) (ois.readObject());
		} catch (Exception e) {
			System.out.println("Problem serializing: " + e);
		}
		System.out.println("displaying all todo\n===================\n");
		for(ToDo t:list)
		{
			System.out.println( t+"\n");
		}
			

	}
}
