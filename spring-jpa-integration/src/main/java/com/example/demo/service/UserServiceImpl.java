package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.User;
import com.example.demo.shared.SharedUser;
@Service
@EnableTransactionManagement
public class UserServiceImpl implements UserService{

	private UserDAO userDAO;
	private ModelMapper modelMapper;
	
	{
		modelMapper=new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}
	
	@Autowired
	public UserServiceImpl(UserDAO userDAO) {
		super();
		this.userDAO = userDAO;
		
	}

	@Override
	@Transactional
	public SharedUser createUser(User user) {
		
		User tempUser=userDAO.save(user);
		return modelMapper.map(tempUser, SharedUser.class);
	}

	@Override
	@Transactional
	public Optional<User> findUserById(Integer id) {
		// TODO Auto-generated method stub
		Optional<User> user=userDAO.findById(id);
		System.out.println(user);
		return user;
	}
}
