package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ToDo {
	private String todoId;
	private String todoName;
	public String getTodoId() {
		return todoId;
	}
	public void setTodoId(String todoId) {
		this.todoId = todoId;
	}
	public String getTodoName() {
		return todoName;
	}
	public void setTodoName(String todoName) {
		this.todoName = todoName;
	}
	

}
