package com.qyb.myprofile.mapper;

import java.util.List;

import com.qyb.myprofile.entity.Profile;

public interface ProfileMapper {
	List<Profile> find();    //查询所有人员
	
	Profile findById(int id);    //根据编号查询详细信息
	
	int update(Profile profile);     //修改人员信息
}
