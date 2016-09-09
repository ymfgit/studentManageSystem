package com.yc.mybatis.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yc.mybatis.entity.Profile;

@Repository("/profileMapper")
public interface ProfileMapper {
	//查找所有的信息
	public List<Profile> findAllProfile();
	
	//根据id值查找信息
	public List<Profile> findProfileById(int id);
	
	//根据id值修改信息
	public int updateProfile(Profile profile);
}
