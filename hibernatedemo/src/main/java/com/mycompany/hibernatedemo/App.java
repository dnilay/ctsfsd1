package com.mycompany.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernatedemo.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        try {
        	SessionFactory factory=new Configuration().configure().
        			addAnnotatedClass(Student.class).buildSessionFactory();
        	Session session=factory.openSession();
        	session.getTransaction().begin();
        	session.save(new Student("John", "Doe", "john@email.com"));
			session.getTransaction().commit();
			System.out.println("inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
