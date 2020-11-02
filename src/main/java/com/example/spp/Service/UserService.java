package com.example.spp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spp.Modal.User;

@Service
public interface UserService {

	List<User> login(String userName, String password);

	User saveDetails(User user);

	List<User> getDetails(User user);

	List<User> getAll();



}
