package comm.example.h2.connection.service;

import java.sql.SQLException;

import comm.example.h2.connection.data.Customer;
import comm.example.h2.connection.data.CustomerDAO;
import comm.example.h2.connection.data.CustomerDAOImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO dao;
	{
		dao=new CustomerDAOImpl();
	}

	@Override
	public Customer createCuastomer(String firstName, String lastName, String email) throws SQLException {
		// TODO Auto-generated method stub
		return dao.createCuastomer(firstName, lastName, email);
	}

}
