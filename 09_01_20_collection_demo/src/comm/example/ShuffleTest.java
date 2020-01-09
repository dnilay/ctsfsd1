package comm.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleTest {

	public static void main(String[] args) {
		String name[] = { new String("Sang"), new String("Shin"), new String("Boston"), new String("Passion"),
				new String("Shin"), };
		// int[] arr= {10,20,49,-30,130,2};
		/*
		 * List<String> l=Arrays.asList(name); System.out.println("before shuffleing");
		 * System.out.println(l); System.out.println("after shuffleing");
		 * Collections.shuffle(l); System.out.println(l); Collections.sort(l);
		 * System.out.println(l);
		 */

		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(100);
		l.add(-30);
		System.out.println(l);
		int index=Collections.binarySearch(l, -1);
		if(index>=0)
		{
			System.out.println("found "+l.get(index));
		}
		else
		{
			System.out.println("not found "+index);
		}
		

	}

}
