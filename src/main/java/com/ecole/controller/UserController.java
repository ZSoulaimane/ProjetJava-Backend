package com.ecole.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecole.model.Admin;
import com.ecole.model.User;
import com.ecole.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		
		this.userService = userService;
	}
	
	@PostMapping("get")
	public Admin getUser(@RequestBody User user) {
		
		return userService.getUser(user);
	}
	
}
