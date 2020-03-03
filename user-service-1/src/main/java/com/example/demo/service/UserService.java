package com.example.demo.service;

import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

public interface UserService {

	public Iterable<User> getAllUsers();
	Optional<User> findByLastnameOrFirstname(String firstname, String lastname);
	Optional<User> findByEmail(String email);
	public User createUser(User user);
}
