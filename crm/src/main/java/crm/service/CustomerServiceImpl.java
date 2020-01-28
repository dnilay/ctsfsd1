package crm.service;

import crm.dao.CustomerDAO;
import crm.dao.CustomerDAOImpl;
import crm.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO dao;
	{
		dao=new CustomerDAOImpl();
	}

	@Override
	public Customer createCustomer(Customer customer) {
		
		return dao.createCustomer(customer);
	}

}
