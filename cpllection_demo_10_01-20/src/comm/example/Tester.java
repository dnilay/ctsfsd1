package comm.example;

import java.util.HashSet;

import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

public class Tester {

	public static void main(String[] args) {

		/*
		 * Set<Employee> set=new HashSet<Employee>(); set.add(new Employee("John",
		 * UUID.randomUUID().toString(), 10000)); set.add(new
		 * Employee("Marry",UUID.randomUUID().toString(),12000)); set.add(new
		 * Employee("Sachin", UUID.randomUUID().toString(), 5700)); for(Employee e:set)
		 * 
		 * { System.out.println(e+"\n");
		 * 
		 * }
		 */

		Set<Student> set = new TreeSet<Student>();
		set.add(new Student("Johnrttyuyuy", "Doe", 100,0.5));
		set.add(new Student("Shane", "Warne", 110,3.0));
		for (Student s : set) {
			System.out.println(s + "\n");
		}

	}

}
