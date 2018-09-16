package com.rest.module.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.core.module.entity.User;
import com.core.module.service.UserService;

@RestController
@RequestMapping("/v1/user")
public class UserController {
	
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ResponseEntity<Object> list(){
		Map<String, Object> resultMap = new HashMap<>();
		List<User> userList = userService.list();
		resultMap.put("userList", userList);
		log.info("resutlMap:> {}",resultMap);
		return new ResponseEntity<>(resultMap, HttpStatus.OK);
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ResponseEntity<Object> save(@RequestBody User user){
		log.info("save:> {}",user);
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("usert", userService.save(user));
		return new ResponseEntity<>(resultMap, HttpStatus.OK);
	}

}
