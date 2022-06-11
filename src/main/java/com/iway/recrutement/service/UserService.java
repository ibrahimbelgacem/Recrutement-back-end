package com.iway.recrutement.service;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.iway.recrutement.model.User;


public interface UserService {

	 public String signin(String username, String password);
	 public User signup(User user);
	
	 public void delete(String username);
	 public User whoami(HttpServletRequest req);
	 public String refresh(String username);
	 public List<User> ListUsers();
	 public List<User> ListUsersByAdministration(long id);
}
    