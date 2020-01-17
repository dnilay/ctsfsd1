package com.mycompany.spring_demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter

@Component
public class Employee {
	@Value("${employee.id}")
	private String employeeid;
	@Value("${employee.firstName}")
	private String firstName;
	@Value("${employee.lastName}")
	private String lastName;
	@Autowired
	private Address address;
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + "]";
	}

}
