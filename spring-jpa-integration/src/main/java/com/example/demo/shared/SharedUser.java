package com.example.demo.shared;

public class SharedUser {
	private String uId;
	private String firstName;
	private String lastName;
	public SharedUser(String uId, String firstName, String lastName) {
		super();
		this.uId = uId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public SharedUser() {
		super();
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
	
	
}
