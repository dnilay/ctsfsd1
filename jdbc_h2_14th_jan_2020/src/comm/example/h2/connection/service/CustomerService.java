package comm.example.h2.connection.service;

import java.sql.SQLException;

import comm.example.h2.connection.data.Customer;

public interface CustomerService {
	public Customer createCuastomer(String firstName,String lastName,String email) throws SQLException;
}
