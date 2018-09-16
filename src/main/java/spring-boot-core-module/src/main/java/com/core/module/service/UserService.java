package com.core.module.service;

import java.util.List;

import com.core.module.entity.User;

public interface UserService {

	public List<User> list();
	
	public User save(User user);
}
