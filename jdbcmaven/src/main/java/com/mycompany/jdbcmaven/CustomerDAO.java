package com.mycompany.jdbcmaven;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDAO {
	
	public Customer createCuastomer(Customer customer) throws SQLException;
	public List<Customer> findById(String uId) throws SQLException;

}
