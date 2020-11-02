package com.example.spp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spp.Modal.User;
import com.example.spp.Service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/plan")
public class Controller {

	@Autowired
	UserService userService;

	@PostMapping("/login") 
	public List<User> login (@RequestBody User user) {
		return	userService.login(user.getUserName(), user.getPassword());
	}
	
	@PostMapping ("/saveDetails")
	public User saveDetails(@RequestBody User user) {
		return userService.saveDetails(user);
	}
	
	@PostMapping("/getDetails")
	public List<User> getDetails(@RequestBody User user) {
		return userService.getDetails(user);
	}
	
	@GetMapping("/getAllDetails")
	public List<User> getAll() {
		return userService.getAll();
	}
	
	
	
}
