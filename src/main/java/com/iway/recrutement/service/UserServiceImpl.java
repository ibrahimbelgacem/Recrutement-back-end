package com.iway.recrutement.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.iway.recrutement.exception.CustomException;
import com.iway.recrutement.model.User;
import com.iway.recrutement.repository.UserRepository;
import com.iway.recrutement.security.JwtTokenProvider;
@Transactional
@Service
public class UserServiceImpl implements UserService{
	@Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    private AuthenticationManager authenticationManager;

    public User Save(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public String signin(String username, String password) {
    	System.out.println(username);
    	System.out.println(password);
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
            return "{ \"token\": \""+jwtTokenProvider.createToken(username, userRepository.findByUserName(username).getRoles())+"\"}";
        } catch (AuthenticationException e) {
            throw new CustomException("Invalid username/password supplied", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    public User signup(User user) {
        if (!userRepository.existsByUserName(user.getUserName())) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            return userRepository.save(user);
//            return jwtTokenProvider.createToken(user.getUsername(), user.getRoles());
        } else {
            throw new CustomException("Username is already in use", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    public void delete(String username) {
        userRepository.deleteByUserName(username);
    }

    public User search(String username) {
        User user = userRepository.findByUserName(username);
        if (user == null) {
            throw new CustomException("The user doesn't exist", HttpStatus.NOT_FOUND);
        }
        return user;
    }

    public User whoami(HttpServletRequest req) {
        return userRepository.findByUserName(jwtTokenProvider.getUsername(jwtTokenProvider.resolveToken(req)));
    }

    public String refresh(String username) {
        return jwtTokenProvider.createToken(username, userRepository.findByUserName(username).getRoles());
    }

    public List<User> ListUsers(){
        return userRepository.findAll();
    }

    public List<User> ListUsersByAdministration(long id) {
        return userRepository.findAll();
    }
}


