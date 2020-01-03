package comm.example;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Todo {
	private Task task;
	private RandomFortuneSeervice fortuneSeervice;
	private String todoId;
	private LocalDate date;
	private boolean isCompleted;

	public Todo(Task task, RandomFortuneSeervice fortuneSeervice) {

		this.task = task;
		this.fortuneSeervice = fortuneSeervice;
	}

	public void createTodo(String author, String taskName, boolean isCompleted) {
		if (task == null) {
			System.out.println("can't create task existing system");
			System.exit(0);
		}
		if(fortuneSeervice==null)
		{
			System.out.println("bad day today. try again.");
			System.exit(0);
			
		}
		System.out.println("Your Daily Fortune>>> "+fortuneSeervice.getDailyFortune());
		System.out.println("creating a new task.");
		task = new Task();
		task.createTask(author, taskName);
		System.out.println("Sucessfully created task\ncreating new todo..");
		setTodoId(UUID.randomUUID().toString());
		setDate(LocalDate.now());
		setCompleted(isCompleted);

	}

	public String getTodoDetails() {
		return task.getTaskDetails() + " todo id: " + getTodoId() + " todo date: " + getDate() + " completed: "
				+ isCompleted;
	}

}
