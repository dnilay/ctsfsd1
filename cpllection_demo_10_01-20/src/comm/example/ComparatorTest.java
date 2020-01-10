package comm.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest {
	public static void main(String[] args) {
		Comparator c = new NameComp();
		//c=new GPAComparator();
		Set<Student> studentSet = new TreeSet<Student>(c);
		studentSet.add(new Student("Mike", "Hauffmann", 101, 4.0));
		studentSet.add(new Student("John", "Lynn", 102, 2.8));
		studentSet.add(new Student("Jim", "Max", 103, 3.6));
		studentSet.add(new Student("Kelly", "Grant", 104, 2.3));
		Object[] studentArray = studentSet.toArray();
		List<Object>l=Arrays.asList(studentArray);
		Collections.reverse(l);
		Student s;
		for (Object obj : l) {
			s = (Student) obj;
			System.out.printf("Name = %s %s ID = %d GPA = %.1f\n", s.getFirstName(), s.getLastName(), s.getStudentID(),
					s.getGPA());
		}
	}
}