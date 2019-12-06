package com.example.project.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.User;
import com.example.project.reposotory.userReposotory;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	userReposotory userReposotory;

	@Override
	public void save(User u) {
		userReposotory.save(u);
	}

	@Override
	public List<User> getAllUserData() {
		return (List<User>) userReposotory.findAll();
	}

}
