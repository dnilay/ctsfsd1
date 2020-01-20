package com.mycompany.springjdbcdemo.service;

import java.sql.SQLException;
import java.util.List;

import com.mycompany.springjdbcdemo.model.Customer;

public interface CustomerService {
	public Customer createCustomer(Customer customer) throws SQLException;
	public List<Customer> getAllCustomers()throws SQLException;
}
