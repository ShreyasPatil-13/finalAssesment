package com.assesment.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.demo.model.User;
import com.assesment.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

}
