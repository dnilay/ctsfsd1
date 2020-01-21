package comm.example.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.entity.Person;

public final class HibernateUtil {
	
	private static SessionFactory factory;
	
static {
	factory=new Configuration().configure().
			addAnnotatedClass(Person.class).
			buildSessionFactory();
}
	private HibernateUtil() {
		
	}
	public static Session getSession()
	{
		return factory.openSession();
	}

}
