package com.example.spp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spp.Modal.User;
import com.example.spp.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> login(String userName, String password) {
		System.out.println(password);
		if (userName != null && password != null) {
		return userRepository.login(userName, password);
		} else {
			return null;
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public User saveDetails(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> getDetails(User user) {
		// TODO Auto-generated method stub
		return userRepository.getDetails(user.getUserId(), user.getUserName(), user.getPassword());
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	
}
