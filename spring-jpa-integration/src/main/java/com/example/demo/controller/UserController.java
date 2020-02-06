package com.example.demo.controller;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.shared.SharedUser;

@RestController
@RequestMapping("/api")
public class UserController {
	private UserService userService;
private ModelMapper modelMapper;
	
	{
		modelMapper=new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	@GetMapping("/users/{id}")
	public SharedUser find(@PathVariable Integer id)
	{
		 Optional<User> user=userService.findUserById(id);
		return modelMapper.map(user, SharedUser.class);
	}
	@PostMapping("/users")
	public SharedUser create(@RequestBody User user)
	{
		user.setuId(UUID.randomUUID().toString());
		user.setCreationDate(LocalDate.now());
		user.setAdmin(false);
		return userService.createUser(user);
	}
}
