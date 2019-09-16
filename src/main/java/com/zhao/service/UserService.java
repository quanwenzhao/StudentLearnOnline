package com.zhao.service;

import java.util.List;

import com.zhao.model.User;

public interface UserService {
	List<User> findAll();
	void insertUser(User user);
	User selectUserByAccount(String account);
	User login(String account, String password);
}
