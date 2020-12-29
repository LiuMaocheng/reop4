package com.z1806.dao;

import java.util.List;

import com.z1806.pojo.User;

public interface UserMapper {

	List<User> findAll();

	User findById(int id);

	int delete(int id);

	int update(User user);

}
