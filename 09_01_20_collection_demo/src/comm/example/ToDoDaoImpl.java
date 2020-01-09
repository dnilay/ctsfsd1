package comm.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class ToDoDaoImpl implements ToDoDao {
	private List<ToDo> toDoList=null;
	private ToDo toDo;
	{
		toDoList=new ArrayList<ToDo>();
	}

	@Override
	public ToDo createToDo(String toDoName) {
		toDo=new ToDo(UUID.randomUUID().toString(), toDoName);
		toDoList.add(toDo);
		return toDo;
		
	}

	@Override
	public List<ToDo> getAllToDos() {
		// TODO Auto-generated method stub
		return toDoList;
	}

	@Override
	public ToDo findById(String toDoId) {
		// TODO Auto-generated method stub
		
		Iterator<ToDo> iterator=toDoList.iterator();
		
		while(iterator.hasNext())
		{
			toDo=iterator.next();
			if(toDo.getToDoId()==toDoId)
			{
				
				System.out.println(toDo.getToDoId());
				break;
			}
		}
		return toDo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
