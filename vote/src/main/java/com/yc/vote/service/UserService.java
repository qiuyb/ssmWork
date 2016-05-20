package com.yc.vote.service;

import com.yc.vote.entity.User;

public interface UserService {
	User login(User user);
	int register(User user);
	boolean login2(User user);
	boolean login1(User user);
	User find(User user);
	int update(String vuemail);
}
