package comm.example;

public class Tester {

	public static void main(String[] args) {
		Counter counter1=new Counter("MyObject-1== ");
		System.out.printf("%s",counter1);
		Counter counter2=new Counter("MyObject-2== ");
		System.out.printf("%s",counter2.toString());
		Counter counter3=new Counter("MyObject-3== ");
		System.out.printf("%s",counter3.toString());
		Counter counter4=new Counter("MyObject-4== ");
		System.out.printf("%s",Counter.displayCount());

	}

}
