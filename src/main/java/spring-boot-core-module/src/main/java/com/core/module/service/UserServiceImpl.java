package com.core.module.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.module.dao.UserDao;
import com.core.module.entity.User;

@Service
public class UserServiceImpl implements UserService {

	
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> list() {
		return userDao.findAll();
	}

	@Override
	public User save(User user) {
		log.info("save:> {}",user);
		return userDao.save(user);
	}

}
