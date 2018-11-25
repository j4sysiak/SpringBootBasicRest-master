package com.frugalis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.frugalis.beans.User;
import com.frugalis.service.UserService;

@RestController
public class HelloController {

	@Autowired
	UserService userService;
	
	@PostMapping("/users")
	public User save(@RequestBody User u) {
		return userService.saveUser(u);
	}
 
	@GetMapping("/users")
	public Object[] getAll() {
		return userService.getAllUsers();
 
	}
}
