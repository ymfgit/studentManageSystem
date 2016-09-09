package com.yc.mybatis.controller;
/*package com.yc.mybatis.action;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.apache.struts2.ServletActionContext;
import org.junit.Test;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.yc.mybatis.entity.Profile;
import com.yc.mybatis.mapper.ProfileMapper;
import com.yc.mybatis.util.MyBatisUtil;

public class updateAction implements ModelDriven<Profile>{
	Profile profile=new Profile();
	HttpServletRequest request=ServletActionContext.getRequest();
	
	
	//显示个人具体信息
	public String show(){
		SqlSession session=MyBatisUtil.getSession();
		ProfileMapper profileMapper=session.getMapper(ProfileMapper.class);
		int id=Integer.parseInt(request.getParameter("id"));
		System.out.println(id+"id值");
		List<Profile> list=profileMapper.findProfileById(id);
		System.out.println(list+"进来了.....");
		ActionContext.getContext().getSession().put("proInfo1", list.get(0));
		return "update";
	}
	//修改个人信息
	public String update(){
		SqlSession session=MyBatisUtil.getSession(true);
		ProfileMapper profileMapper=session.getMapper(ProfileMapper.class);
		int result=profileMapper.updateProfile(profile);
		System.out.println(result);
		if(result==1){
			return "update";
		}else{
			return "fail";
		}
		
	}
	@Override
	public Profile getModel() {
		profile=new Profile();
		return profile;
	}
	
	
}
*/