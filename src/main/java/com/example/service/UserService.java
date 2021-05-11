package com.example.service;

import com.example.model.User;

public interface UserService {
	public User signUp(User user);
	    public User findUserByEmail(String email);

}
