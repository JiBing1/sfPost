package com.sf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sf.model.User;
import com.sf.service.UserService;

@RequestMapping("/user")
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/getUser",method=RequestMethod.GET)
	@ResponseBody
	public User getUser(@RequestParam(value="username",required=true)String username) {
		User user = new User();
		user.setUsername(username);
		return userService.getUser(user);
	}
}
