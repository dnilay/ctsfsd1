package com.example.demo.service;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

public interface UserService {

	public Iterable<User> getAllUsers();

}
