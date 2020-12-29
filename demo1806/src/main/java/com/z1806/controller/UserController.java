package com.z1806.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.z1806.pojo.User;
import com.z1806.service.UserService;
import com.z1806.util.Result;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/findAll")
	public PageInfo<User> findAll(@RequestParam(defaultValue = "1",name = "page")int page,
			@RequestParam(defaultValue = "10",name = "limit")int pageSize) {
		List<User> users=userService.findAll(page,pageSize);
		//将查询到的数据封装到分页对象中
		PageInfo<User> pageInfo=new PageInfo<>(users);
		return pageInfo;
	}
	
	@RequestMapping("/findById")
	public Result findById(int id) {
		User user=userService.findById(id);
		Result result;
		if(user==null) {
			result=new Result(0, "查询用户数据失败！", user);
		}else {
			result=new Result(1, "查询用户数据成功！", user);
		}
		return result;
	}
	
	@RequestMapping("/delete")
	public Result delete(int id) {
		int row=userService.delete(id);
		Result result=new Result(1, "", row);
		return result;
	}
	
	@RequestMapping("/update")
	public Result update(User user) {
		int row=userService.update(user);
		Result result=new Result(1, "", row);
		return result;
	}
	
	
	
}
