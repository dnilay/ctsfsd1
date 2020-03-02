package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRest {

	@GetMapping("/hello")
	public String sayHello()
	{
		return "hello world";
	}
}
