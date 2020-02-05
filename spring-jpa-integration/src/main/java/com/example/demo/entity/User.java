package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@JsonIgnore
	private String uId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String securitySocialNumber;
	@JsonIgnore
	private boolean isAdmin;
	@JsonIgnore
	private LocalDate creationDate;
	public User() {
		super();
	}

	public User(Integer id, String uId, String firstName, String lastName, String email, String password,
			String securitySocialNumber, boolean isAdmin) {
		super();
		this.id = id;
		this.uId = uId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.securitySocialNumber = securitySocialNumber;
		this.isAdmin = isAdmin;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecuritySocialNumber() {
		return securitySocialNumber;
	}

	public void setSecuritySocialNumber(String securitySocialNumber) {
		this.securitySocialNumber = securitySocialNumber;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

}