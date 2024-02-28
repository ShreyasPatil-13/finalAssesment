package com.assesment.demo.services;

import java.util.List;

import com.assesment.demo.model.User;

public interface UserService {
	User saveUser(User user);
	List<User> getUsers();
}

