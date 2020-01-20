package com.mycompany.springjdbcdemo.model;

import org.springframework.jdbc.core.JdbcTemplate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Customer {
	private String uid;
	private String firstName;
	private String lastName;
	private String email;
	public Customer(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	@Override
	public String toString() {
		return String.format("%-20s%-20s%-20s%-20s\n", uid,firstName,lastName,email);
	}


}
