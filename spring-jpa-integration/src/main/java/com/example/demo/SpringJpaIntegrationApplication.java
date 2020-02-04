package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.BookDAO;
import com.example.demo.entity.Book;

@SpringBootApplication
public class SpringJpaIntegrationApplication implements CommandLineRunner {

	private BookDAO bookDAO;
	
	@Autowired
	public SpringJpaIntegrationApplication(BookDAO bookDAO) {
		super();
		this.bookDAO = bookDAO;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaIntegrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		bookDAO.save(new Book(100,"Book-1","Author-1"));
		bookDAO.save(new Book(101,"Book-2","Author-2"));
		bookDAO.save(new Book(102,"Book-3","Author-3"));
		bookDAO.save(new Book(103,"Book-4","Author-4"));
		bookDAO.save(new Book(104,"Book-5","Author-5"));
		bookDAO.save(new Book(105,"Book-6","Author-6"));
	
	}

	
	
}




	


