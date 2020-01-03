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
private String todoId;
private LocalDate date;
private boolean isCompleted;

public void createTodo(String author,String taskName,boolean isCompleted)
{
	System.out.println("creating a new task.");
	task=new Task();
	task.createTask(author,taskName);
	System.out.println("Sucessfully created task\ncreating new todo..");
	setTodoId(UUID.randomUUID().toString());
	setDate(LocalDate.now());
	setCompleted(isCompleted);

}


public String getTodoDetails()
{
	return task.getTaskDetails()+" todo id: "+getTodoId()+
			" todo date: "+getDate()+" completed: "+isCompleted;
}

}
