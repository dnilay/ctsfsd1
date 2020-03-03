package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "last_name")
	private String lName;
	@Column(name = "fast_name")
	private String fName;
	private String email;
	
	
	public User(String lName, String fName, String email) {
		super();
		this.lName = lName;
		this.fName = fName;
		this.email = email;
	}


	public User() {
		super();
	}

}
