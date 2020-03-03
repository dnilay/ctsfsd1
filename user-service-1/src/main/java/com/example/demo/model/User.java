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
	private String lastname;
	@Column(name = "fast_name")
	private String firstname;
	private String email;
	
	
	


	public User() {
		super();
	}





	public User(String lastname, String firstname, String email) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.email = email;
	}

}
