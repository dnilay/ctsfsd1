package com.mycompany.jdbcmaven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import com.mycompany.jdbcmaven.Customer;

public class CustomerApp {
	private static CustomerService service;
	static {
		service = new CustomerServiceImpl();
	}

	public static void main(String args[]) throws NumberFormatException, IOException, SQLException {
		int choice = 0;
		String fName,lName,email,uId;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1. create customer");
			System.out.println("2. display all customers");
			System.out.println("3. find customer by id");
			System.out.println("4. update customer");
			System.out.println("5. delete customer");
			System.out.println("0. exit");
			System.out.print("choice: ");
			choice = Integer.parseInt(br.readLine().toString());
			switch (choice) {
			case 1:
				System.out.print(" First Name: ");
				fName=br.readLine().toString();
				System.out.print(" Last Name: ");
				lName=br.readLine().toString();
				System.out.print(" Email: ");
				email=br.readLine().toString();
				String arr[]=UUID.randomUUID().toString().split("-");
				Customer theCustomer=new Customer((arr[0]+arr[1]), fName, lName, email);
				Customer customer=service.createCuastomer(theCustomer);
				System.out.println("Create Customer Sucess "+customer);
				break;
			case 3:
				System.out.print(" UID Name: ");
				uId=br.readLine().toString();
				List<Customer> list=service.findById(uId);
				if(list.isEmpty())
				{
					System.out.println("no such uid found");
				}
				else {
					Customer c=list.get(0);
					System.out.println("customer found: "+c);
				}
				break;
			case 0:
				System.exit(0);
				
			default:
				System.out.println("invalid choice");
				break;
			}

		} while (choice != 0);

	}
}
