package crm.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import crm.model.Customer;

public class CustomerUtil {

	private static SessionFactory factory=null;
	public static SessionFactory getMySessionFactory()
	{
		return new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Customer.class)
				.buildSessionFactory();
	}

}
