package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repositories.UserRepositories;
import com.example.demo.entities.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepositories userRepositories;
	
	public List<User> getAllUser(){
		return userRepositories.findAll();
	}
}
