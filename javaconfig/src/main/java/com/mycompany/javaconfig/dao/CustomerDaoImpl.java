package com.mycompany.javaconfig.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.mycompany.javaconfig.model.Customer;
import com.mycompany.javaconfig.model.CustomerRowMapper;

@Component("dao")

public class CustomerDaoImpl implements CustomerDao {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		String sql="insert into customer(uid,first_name,last_name,email) values(?,?,?,?)";
		jdbcTemplate.update(sql, 
				new Object[] {customer.getUid(),customer.getFirstName(),customer.getLastName(),customer.getEmail()});
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		
		String query="select uid,first_name,last_name,email from customer";
		
		
		return jdbcTemplate.query(query, new CustomerRowMapper());
	}

	@Override
	public List<Customer> getCustomerById(String uId) throws SQLException {
		String query="select uid,first_name,last_name,email from customer where uid=?";
		return jdbcTemplate.query(query, new Object[] {uId},new CustomerRowMapper());
	}

	@Override
	public int updateCustomerById(Customer customer) throws SQLException {
	
		return jdbcTemplate.update("update customer set first_name=?"
				+ ",last_name=?,email=? where uid=?",new Object[] {customer.getFirstName(),customer.getLastName()
						,customer.getEmail(),customer.getUid()});
	}

	@Override
	public int deleteCustomer(String uId) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
