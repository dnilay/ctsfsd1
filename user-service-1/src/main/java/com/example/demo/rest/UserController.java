package com.example.demo.rest;

import java.util.Optional;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@RequestMapping("/users")
	@ResponseBody
	@LoadBalanced
	public Iterable<User> getAllUsers() {
		return userService.getAllUsers();
	}
	@RequestMapping("/users/{lName}/{fName}")
	public Optional<User> findByLastNameOrFirstName(@PathVariable String lName,@PathVariable String fName)
	{
		return userService.findByLastnameOrFirstname(lName, fName);
	}
	@RequestMapping("/users/{email}")
	public Optional<User> findByEmail(@PathVariable String email)
	{
		return userService.findByEmail(email);
	}
	@PostMapping("/users")
	public User createUser(@RequestBody User user)
	{
		return userService.createUser(user);
	}
	
	
	
	
	
	
	
	
	
}
