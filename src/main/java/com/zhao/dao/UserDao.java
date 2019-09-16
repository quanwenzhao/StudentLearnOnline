package com.zhao.dao;

import java.util.List;

import com.zhao.model.User;

public interface UserDao {
	List<User> findAll();
}
