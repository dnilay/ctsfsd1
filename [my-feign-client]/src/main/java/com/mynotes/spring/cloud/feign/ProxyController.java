package com.mynotes.spring.cloud.feign;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mynotes.spring.cloud.service.Groups;

@RestController
public class ProxyController {

	@Autowired
	private UserServiceClient userServiceClient;
	@RequestMapping("/groups")
	public List<Groups> getAllGroups(){
		
		return userServiceClient.getAllGroups();
	}
}
