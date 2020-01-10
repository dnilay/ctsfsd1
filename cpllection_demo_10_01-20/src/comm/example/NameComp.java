
package comm.example;

import java.util.*;

public class NameComp implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		return (o1.getFirstName().compareTo(o2.getFirstName()));
	}
}
