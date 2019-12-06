package com.example.project.userservice;

import java.util.List;

import com.example.project.model.User;

public interface UserService {

	void save(User u);

	List<User> getAllUserData();

}
