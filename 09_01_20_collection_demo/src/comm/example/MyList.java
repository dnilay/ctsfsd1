package comm.example;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyList {

	private List<String> list = null;

	{
		list = new LinkedList<String>();
	}

	public void getSortedList() {
		list.add("Sang");
		list.add("Sing");
		list.add("Boston");
		list.add("America");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}

	public static void main(String[] args) {
		MyList myList = new MyList();
		myList.getSortedList();
	}

}
