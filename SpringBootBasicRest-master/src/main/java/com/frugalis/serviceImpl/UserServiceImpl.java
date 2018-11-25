package com.frugalis.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.frugalis.beans.User;
import com.frugalis.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	public static List<User> userStoragLe = new ArrayList<User>();

	@Override
	public User saveUser(User inUser) {
		int index = userStoragLe.size();

		if (!userStoragLe.contains(inUser)) {
			inUser.setUserId(index + 1);
			userStoragLe.add(inUser);
			return inUser;
		}

		return inUser;
	}

	@Override
	public Object[] getAllUsers() {

		return userStoragLe.toArray();
	}

}
