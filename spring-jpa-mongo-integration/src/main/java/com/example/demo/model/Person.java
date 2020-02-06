package com.example.demo.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;
@Document(collation = "people")
@Data
@ToString(exclude = "dateOfBirth")
public class Person {
	
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private Address address;
	@JsonIgnore
	private LocalDate dateOfBirth;
	private List<Hobby> hobbies;
	public Person(String firstName, String lastName, Address address, List<Hobby> hobbies) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.hobbies = hobbies;
	}

}
