package comm.example;

import java.util.Scanner;

public class Tester {

	private static final int MAX = 5;

	private static Scanner scanner = new Scanner(System.in);

///main method started
	public static void main(String[] args) {
		/*int counter=-1;
		ToDoClass todos[]=new ToDoClass[MAX];
		int choice=0;
		ToDoClass todo=new ToDoClass();
		ToDoClass tempTodo=null;
		do {
			System.out.println("1.add new todo.");
			System.out.println("2.display all todo");
			System.out.println("0. exit");
			System.out.print("slect your choice: ");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
				if(counter==MAX-1)
				{
					System.out.println("Cant not create more todo...");
					break;
				}
				System.out.print("task author: ");
				String author=scanner.next();
				System.out.print("task name: ");
				String taskName=scanner.next();
				System.out.print("Is Completed? ");
				boolean isCompleted=scanner.nextBoolean();
				tempTodo=todo.createTodo(author, taskName, isCompleted);
				todos[++counter]=tempTodo;
				break;
			case 2:
				for(int i=0;i<=counter;i++)
				{
					System.out.println("\n"+todos[i].getTodoDetails());
				}
				break;
			case 0:
				System.out.println("bye!!!!");
				System.exit(0);
			
				break;

			default:
				System.out.println("invalid choice");
				break;
			}
		} while (choice !=0);
	
		
		 * Todo todo=new Todo(new Task(),new RandomFortuneSeervice());
		 * todo.createTodo("John", "Learning Angular", false);
		 * System.out.println(todo.getTodoDetails());*/
		Person thePerson=new Person();
		System.out.println(thePerson);
		 
	}

}
