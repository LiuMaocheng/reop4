package com.z1806.service;

import java.util.List;

import com.z1806.pojo.User;

public interface UserService {

	List<User> findAll(int page, int pageSize);

	User findById(int id);

	int delete(int id);

	int update(User user);

}
