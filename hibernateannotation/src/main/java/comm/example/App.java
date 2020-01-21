package comm.example;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.entity.Person;

public class App 
{
    public static void main( String[] args )
    
    {
    	SessionFactory factory=null;
    	Session session=null;
       try {
    	   factory=new Configuration().configure().addAnnotatedClass(Person.class)
    			   .buildSessionFactory();
    	   session=factory.openSession();
			/*
			 * Person person=new Person(); person.setUId(UUID.randomUUID().toString());
			 * person.setDateOfBirth(LocalDate.now()); person.setCName("Doe");
			 * session.getTransaction().begin(); session.save(person);
			 * session.getTransaction().commit(); System.out.println(person);
			 */
    	 Query q= session.createQuery("from Person");
    	 List<Person> l=q.list();
    	for(Person p:l)
    	{
    		System.out.println(p);
    	}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
       finally {
		session.close();
		factory.close();
	}
    }
}
