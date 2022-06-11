package com.iway.recrutement.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.authentication.UserServiceBeanDefinitionParser;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iway.recrutement.model.User;
import com.iway.recrutement.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestBody User user) {

    	System.out.println(user.toString());
		return userService.signin(user.getUserName(), user.getPassword());
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public User signup(@RequestBody User user) {
		return userService.signup(user);
	}

	@PreAuthorize("hasRole('ROLE_MANAGER') or hasRole('ROLE_RH')")
	@RequestMapping(value = "/me/${UserController.me}", method = RequestMethod.GET)
	public User me(HttpServletRequest req) {
		return userService.whoami(req);
	}

}
