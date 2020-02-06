package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entity.User;
import com.example.demo.shared.SharedUser;

public interface UserService {
	
	public SharedUser createUser(User user);
	public Optional<User> findUserById(Integer id);

}
