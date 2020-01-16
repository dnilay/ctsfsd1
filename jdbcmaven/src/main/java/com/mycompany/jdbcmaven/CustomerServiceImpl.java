package com.mycompany.jdbcmaven;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import com.mycompany.jdbcmaven.Customer;
import com.mycompany.jdbcmaven.CustomerDAO;
import com.mycompany.jdbcmaven.CustomerDAOImpl;

public class CustomerServiceImpl implements CustomerService {
	static Logger logger=Logger.getLogger("com.mycompany.jdbcmaven.CustomerServiceImpl");
	private CustomerDAO dao;
	{
		dao=new CustomerDAOImpl();
		logger.info("got dao");
	}

	@Override
	public Customer createCuastomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		return dao.createCuastomer(customer);
	}

	@Override
	public List<Customer> findById(String uId) throws SQLException {
		// TODO Auto-generated method stub
		return dao.findById(uId);
	}

}
