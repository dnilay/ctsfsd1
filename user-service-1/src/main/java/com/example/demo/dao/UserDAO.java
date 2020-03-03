package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.User;

public interface UserDAO extends CrudRepository<User, Integer>{
	
	Optional<User> findByLastnameOrFirstname(String firstname, String lastname);
	Optional<User> findByEmail(String email);

}
