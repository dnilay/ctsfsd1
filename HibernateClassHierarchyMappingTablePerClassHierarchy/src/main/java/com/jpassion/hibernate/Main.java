package com.jpassion.hibernate;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Session session=null;
		try {
			
			session=new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(Book.class)
					.addAnnotatedClass(InternationalBook.class)
					.addAnnotatedClass(SpecialEditionBook.class).buildSessionFactory()
					.getCurrentSession();
			Book book1=new Book("Learning java", "John", LocalDate.now(), 100);
			Book book2=new InternationalBook("Learning Spring", "Doe", LocalDate.now(), 110, "English", 1);
			Book book3=new SpecialEditionBook("Learning Angular", "author-1", LocalDate.now(), 90, "e-book available");
		session.getTransaction().begin();
			session.save(book1);
			session.save(book2);
			session.save(book3);
			session.getTransaction().commit();
			System.out.println("done");
		} finally {
			//session.close();
		}

	}

}
