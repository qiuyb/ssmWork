package com.yc.vote.service.impl;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.vote.entity.User;
import com.yc.vote.mapper.UserMapper;
import com.yc.vote.service.UserService;
import com.yc.vote.util.VoteData;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean login1(User user) {
		User ur=userMapper.login1(user);
		if(ur==null||ur.equals("")){
			return false;
		}
		return true;
	}

	@Override
	public boolean login2(User user) {
		User ur=userMapper.login2(user);
		if(ur==null||ur.equals("")){
			return false;
		}
		return true;
	}

	@Override
	public User login(User user) {
		return userMapper.login2(user);
	}

	@Override
	public int register(User user) {
		return userMapper.register(user);
	}

	@Override
	public User find(User user) {
		return userMapper.find(user);
	}

	@Override
	public int update(String vuemail) {
		return userMapper.update(vuemail);
	}
}
