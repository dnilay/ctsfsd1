package com.mycompany.customerdemo.bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private String employeeid;
	private String firstName;
	private String lastName;
	private Address address;
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + "]";
	}

}
