package com.skcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skcc.domain.user.User;
import com.skcc.service.user.UserServiceImpl;

@RestController
public class UserRestController {

	
	@Autowired
	private UserServiceImpl us;
	
	public UserRestController(UserServiceImpl us) {
		this.us = us;
	}
	
	@GetMapping("/user")
	public User user() {
		return us.getUserByUserId("qoloa0326");
	}
	  	
}
