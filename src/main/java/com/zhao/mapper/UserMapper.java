package com.zhao.mapper;

import java.util.List;

import com.zhao.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	List<User> findAll();
	void insertUser(User user);
	void deleteUserById(int id);
	void updateUserById(User user);
	User selectUserById(int id);

	User selectUserByAccount(String account);
	User login(@Param("account")String account, @Param("password")String password);
}
