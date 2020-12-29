package com.z1806.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.z1806.dao.UserMapper;
import com.z1806.pojo.User;
import com.z1806.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findAll(int page, int pageSize) {
		//设置分页参数
		PageHelper.startPage(page, pageSize);
		
		return userMapper.findAll();
	}

	@Override
	public User findById(int id) {
		return userMapper.findById(id);
	}

	@Override
	public int delete(int id) {
		return userMapper.delete(id);
	}

	@Override
	public int update(User user) {
		return userMapper.update(user);
	}

}
