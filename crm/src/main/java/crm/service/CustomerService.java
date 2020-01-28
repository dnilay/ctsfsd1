package crm.service;

import java.util.List;

import crm.model.Customer;

public interface CustomerService {
	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
}
