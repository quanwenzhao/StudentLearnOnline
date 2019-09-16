package com.zhao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhao.mapper.UserMapper;
import com.zhao.model.User;
import com.zhao.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
    public UserMapper userMapper;
    
    @Override
    public List<User> findAll() {
        List<User> findAllUser = userMapper.findAll();
        return findAllUser;
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public User selectUserByAccount(String account) {
        return userMapper.selectUserByAccount(account);
    };

    @Override
    public User login(String account, String password) {
        return userMapper.login(account,password);
    }
}
