package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.UserDAO;
import com.example.demo.model.User;

@Service
@EnableTransactionManagement
public class UserServiceImpl implements UserService{
	
	
	private UserDAO userDAO;

	public UserServiceImpl(UserDAO userDAO) {
		super();
		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	public Iterable<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}

	@Override
	@Transactional
	public Optional<User> findByLastnameOrFirstname(String lastname, String firstname) {
		// TODO Auto-generated method stub
		return userDAO.findByLastnameOrFirstname(lastname, firstname);
	}

	@Override
	@Transactional
	public Optional<User> findByEmail(String email) {
		// TODO Auto-generated method stub
		return userDAO.findByEmail(email);
	}

	@Override
	@Transactional
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.save(user);
	}

	
}
