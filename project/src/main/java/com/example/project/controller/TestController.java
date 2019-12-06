package com.example.project.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.model.User;
import com.example.project.reposotory.userReposotory;
import com.example.project.userservice.UserService;

@Controller
public class TestController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	String login() {
		return "login";
	}
	@RequestMapping(value="/check", method=RequestMethod.POST)
	String checkCredentials(@RequestParam("uname") String uname,@RequestParam("psw") String password) {
		List<User> data=userService.getAllUserData();
		AtomicInteger usercheck = new AtomicInteger();
		data.stream().forEach(action->{
			if(action.getUser().equals(uname) && action.getPassword().equals(password)) {
				usercheck.incrementAndGet();
			}
		});
		if((uname.equals("admin")&&password.equals("admin")) || usercheck.get() > 0) {
			return "welcome";
		}
		else {
			return "Error";	
		}
	}
	@RequestMapping(value="/addData", method=RequestMethod.GET)
	String addData() {
		return "addData";
	}
	
	@RequestMapping(value="/Save", method=RequestMethod.GET)
	ModelAndView save(@RequestParam("uname") String uname,@RequestParam("psw") String password) {
		User u=new User(uname,password);
		userService.save(u);
		List<User> data=userService.getAllUserData();
		return new ModelAndView("userData","user",data);
	}
	
	@RequestMapping(value="/showData", method=RequestMethod.GET)
	ModelAndView showData() {
		List<User> userList = userService.getAllUserData();
		return new ModelAndView("userData","user",userList);
	}

}
