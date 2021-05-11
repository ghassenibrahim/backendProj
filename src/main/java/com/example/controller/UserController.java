package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Projet;
import com.example.model.User;
import com.example.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("api/users")

public class UserController {

	@Autowired 
	private UserService userService;

	@PostMapping("")
	public User addUser(@RequestBody User user) {
		return  userService.signUp(user);
	}
	@GetMapping("/{email}")
	public User getUserByEmail( @PathVariable String email) {
		return userService.findUserByEmail(email);
	}

}
