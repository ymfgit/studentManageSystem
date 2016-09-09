package com.yc.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.mybatis.entity.Profile;
import com.yc.mybatis.mapper.ProfileMapper;
import com.yc.mybatis.service.ProfileService;


@Service("profileService")
public class ProfileServiceImpl implements ProfileService {
    @Autowired
	ProfileMapper profileMapper;
	
	@Override
	public List<Profile> findAllProfile() {
		return profileMapper.findAllProfile();
	}

	@Override
	public List<Profile> findProfileById(int id) {
		return profileMapper.findProfileById(id);
	}

	@Override
	public int updateProfile(Profile profile) {
		return profileMapper.updateProfile(profile);
	}

}
