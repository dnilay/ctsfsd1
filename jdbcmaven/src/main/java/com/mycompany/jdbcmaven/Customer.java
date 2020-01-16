package com.mycompany.jdbcmaven;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Customer implements Serializable {

	private static final long serialVersionUID = -375065079056659899L;
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String uId;
	
	public Customer(String uId,String firstName, String lastName, String email) {
		super();
		this.uId=uId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", uId=" + uId
				+ "]";
	}


}
