package comm.example;

import java.util.Set;

public class Tester {

	private static CustomerService customerService;
	static
	{
		customerService=new CustomerService();
	}
	public static void main(String[] args) {
		
		
	customerService.addCustomer(100, "John", "Doe", "john@love2code.com");
	customerService.addCustomer(110, "Sachin", "tendulkar", "sachin@love2code.com");
	Set<Customer> set=customerService.getAllCustomers();
	System.out.println(set);
	}

}
