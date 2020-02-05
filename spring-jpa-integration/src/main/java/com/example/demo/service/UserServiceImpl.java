package com.example.demo.service;

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
	public SharedUser findUserById(Integer id) {
		// TODO Auto-generated method stub
		return modelMapper.map(userDAO.findById(id), SharedUser.class);
	}

}
