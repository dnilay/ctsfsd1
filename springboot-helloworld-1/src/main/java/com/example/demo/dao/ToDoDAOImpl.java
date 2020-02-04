package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.ToDo;
@Repository
public class ToDoDAOImpl implements ToDoDAO {
	private List<ToDo> todoList;
	{
		todoList=new ArrayList<ToDo>();
		todoList.add(new ToDo("t1", "test todo-1"));
		todoList.add(new ToDo("t2", "test todo-2"));
		todoList.add(new ToDo("t3", "test todo-3"));
		todoList.add(new ToDo("t4", "test todo-4"));
		todoList.add(new ToDo("t5", "test todo-5"));
	}

	@Override
	public List<ToDo> getAllToDos() {
		
		return todoList;
	}

}
