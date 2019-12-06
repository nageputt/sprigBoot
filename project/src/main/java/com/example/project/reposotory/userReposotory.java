package com.example.project.reposotory;

import org.springframework.data.repository.CrudRepository;

import com.example.project.model.User;

public interface userReposotory extends CrudRepository<User, String>{

}
