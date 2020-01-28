package crm.dao;

import java.util.List;

import crm.model.Customer;

public interface CustomerDAO {

	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
}
