package com.mycompany.springjdbcdemo;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.mycompany.springjdbcdemo.dao.CustomerDao;
import com.mycompany.springjdbcdemo.model.Customer;
import com.mycompany.springjdbcdemo.service.CustomerService;

@Component
public class App 
{
	CustomerService service;
	
    public static void main( String[] args )
    {
    	
    	ClassPathXmlApplicationContext context=null;
    	
    	CustomerService service;		
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
			context=new ClassPathXmlApplicationContext("applicationContext.xml");
			service=context.getBean("service",CustomerService.class);
			/*
			 * Customer customer=new Customer("100u","John", "doe", "john@email.com");
			 * service.createCustomer(customer);
			 */
			List<Customer> l=service.getAllCustomers();
			l.forEach(c->{
				System.out.println(c);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
    	finally {
			context.close();
		}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
