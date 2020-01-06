package comm.example;

public class Tester {

	public static void main(String[] args) {
	MyArray myArray=new MyArray();
		/*
		 * myArray.createArray(); myArray.displayArray();
		 */
	//myArray.convertStringToArray("Hello World");
	//myArray.displayConvertedArray();
	//original array
	int[] myArray1 = { 1, 2, 3, 4, 5, 6 };
	
	// new larger array
	int[] hold = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
	
	 // copy all of the myArray array to the hold
	 // array, starting with the 0th index
	 System.arraycopy(myArray1, 0, hold, 0, myArray1.length);
	for(int a:hold)
	{
		System.out.println(a);
	}
	}

}
