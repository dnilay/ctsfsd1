package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.example.demo.dao.UserDAO;
import com.example.demo.model.User;

@SpringBootApplication
@EnableEurekaClient
public class UserService1Application implements CommandLineRunner {

	@Autowired
	private UserDAO userDAO;

	public static void main(String[] args) {
		SpringApplication.run(UserService1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		userDAO.save(new User("Doe", "John", "john@luv2code.com"));
		userDAO.save(new User("Smith", "Dave", "dave@luv2code.com"));

	}

}
