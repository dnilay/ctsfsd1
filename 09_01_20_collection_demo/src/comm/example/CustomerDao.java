package comm.example;

import java.util.HashSet;
import java.util.Set;

public class CustomerDao {
	private Set<Customer> customerSet=null;
	
	{
		customerSet=new HashSet<Customer>();
	}
	
	public void createCustomer(int customerId,String firstName,String lastName,String email)
	{
		customerSet.add(new Customer(customerId, firstName, lastName, email));
		
	}
	
	public Set<Customer> getAllCustomers()
	{
		return customerSet;
	}

}
