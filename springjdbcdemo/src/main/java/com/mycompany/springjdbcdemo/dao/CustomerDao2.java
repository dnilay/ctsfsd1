package com.mycompany.springjdbcdemo.dao;

import java.sql.SQLException;
import java.util.List;

import com.mycompany.springjdbcdemo.model.Customer;

public interface CustomerDao2 {

	public Customer createCustomer(Customer customer) throws SQLException;
	public List<Customer> getAllCustomers()throws SQLException;
	public List<Customer> getCustomerById(String uId) throws SQLException;
	public int updateCustomerById(Customer customer)throws SQLException;
	public int deleteCustomer(String uId) throws SQLException;
}
