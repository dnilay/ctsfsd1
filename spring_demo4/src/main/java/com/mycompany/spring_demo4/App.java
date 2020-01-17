package com.mycompany.spring_demo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
try {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Employee employee=context.getBean("employee",Employee.class);
	Address address=context.getBean("add",Address.class);
	address.setAddressLine1("odisha");
	address.setAddressLine2("India");
	address.setPhoneNumber("12345");
	address.setZipCode("000");
	employee.setAddress(address);
	System.out.println(employee);
	
} catch (Exception e) {
	e.printStackTrace();
}
	}
}
