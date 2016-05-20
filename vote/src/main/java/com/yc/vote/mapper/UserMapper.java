package com.yc.vote.mapper;

import com.yc.vote.entity.User;


public interface UserMapper {
	int register(User user);
	User login1(User user);
	User login2(User user);
	User find(User user);
	int update(String vuemail);
}