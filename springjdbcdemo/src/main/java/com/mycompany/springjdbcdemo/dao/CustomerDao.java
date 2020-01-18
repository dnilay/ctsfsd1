package com.mycompany.springjdbcdemo.dao;

import java.sql.SQLException;

import com.mycompany.springjdbcdemo.model.Customer;

public interface CustomerDao {

	public Customer createCustomer(Customer customer) throws SQLException;
}
