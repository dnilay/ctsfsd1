package com.mycompany.springjdbcdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.mycompany.springjdbcdemo.model.Customer;
import com.mycompany.springjdbcdemo.service.CustomerService;

@Component
public class App 
{
	CustomerService service;
	
    public static void main( String[] args ) throws NumberFormatException, IOException, SQLException
    {
    	
    	ClassPathXmlApplicationContext context=null;
    	BufferedReader br=null;
    	CustomerService service=null;		
		/*
		 * try { ApplicationContext context=new
		 * ClassPathXmlApplicationContext("applicationContext.xml"); CustomerDao
		 * dao=context.getBean("dao",CustomerDao.class); Customer
		 * c=dao.createCustomer(new Customer(UUID.randomUUID().toString(),"John", "Doe",
		 * "john@email.com")); System.out.println(c);
		 * 
		 * } catch (Exception e) { e.printStackTrace(); }
		 */
    	
    	
    	try {
    		br=new BufferedReader(new InputStreamReader(System.in));
			context=new ClassPathXmlApplicationContext("applicationContext.xml");
			service=context.getBean("service",CustomerService.class);
			/*
			 * Customer customer=new Customer("100u","John", "doe", "john@email.com");
			 * service.createCustomer(customer);
			 */
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	finally {
			context.close();
		}
    	
    	int choice=-1;
    	String uId,firstName,lastName,email=null;
    	do {
    		System.out.println("1. create customer.");
    		System.out.println("2. display all customer.");
    		System.out.println("3. find customer by uid.");
    		System.out.println("4. update customer.");
    		System.out.println("5. delete customer.");
    		System.out.print("enter your choice>> ");
    		choice=Integer.parseInt(br.readLine());
    		switch (choice) {
			case 1:
				System.out.print("first name>> ");
				firstName=br.readLine();
				System.out.print("last name>> ");
				lastName=br.readLine();
				System.out.print("email>> ");
				email=br.readLine();
				String[] arr=UUID.randomUUID().toString().split("-");
				uId=arr[0]+arr[1];
				service.createCustomer(new Customer(uId, firstName, lastName, email));
				break;
			case 2:
				List<Customer> l=service.getAllCustomers();
				System.out.format("%-20s%-20s%-20s%-20s\n", "ID","FIRST_NAME","LAST_NAME","EMIL");
				l.forEach(c->{
					System.out.println(c);
				});
				break;
			case 3:
				System.out.print("uid>> ");
				uId=br.readLine();
				l=service.getCustomerById(uId);
				if(l.isEmpty())
				{
					System.out.println("customer not found");
				}
				else
				{
					System.out.format("%-20s%-20s%-20s%-20s\n", "ID","FIRST_NAME","LAST_NAME","EMIL");
					l.forEach(c->{
						System.out.println(c);
					});
				}
				break;
			case 4:
				System.out.print("uid>> ");
				uId=br.readLine();
				l=service.getCustomerById(uId);
				if(l.isEmpty())
				{
					System.out.println("customer not found");
				}
				else
				{
					System.out.format("%-20s%-20s%-20s%-20s\n", "ID","FIRST_NAME","LAST_NAME","EMIL");
					l.forEach(c->{
						System.out.println(c);
					});
				}
				break;

			default:
				break;
			}
			
		} while (choice !=0);
    	
    	
    	
    	
    	
    	
    	
    }
}
