package com.qyb.myprofile.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qyb.myprofile.entity.Profile;
import com.qyb.myprofile.mapper.ProfileMapper;
import com.qyb.myprofile.service.ProfileService;

@Service("profileService")
public class ProfileServiceImpl implements ProfileService {
	@Autowired
	private ProfileMapper profileMapper;
	
	@Override
	public List<Profile> find() {
		return profileMapper.find();
	}

	@Override
	public Profile findById(int id) {
		return profileMapper.findById(id);
	}

	@Override
	public int update(Profile profile) {
		return profileMapper.update(profile);
	}

}
