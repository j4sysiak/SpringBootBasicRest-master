package com.frugalis.service;

import com.frugalis.beans.User;


public interface UserService {

	public User saveUser(User inUser);
	public Object[] getAllUsers();
	
}
