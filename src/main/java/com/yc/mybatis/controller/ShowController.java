package com.yc.mybatis.controller;
/*package com.yc.mybatis.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.yc.mybatis.entity.Profile;
import com.yc.mybatis.mapper.ProfileMapper;
import com.yc.mybatis.util.MyBatisUtil;

public class ShowAction{
	Profile profile=new Profile();
	HttpServletRequest request=ServletActionContext.getRequest();
	
	public String show(){
		SqlSession session=MyBatisUtil.getSession();
		ProfileMapper profileMapper=session.getMapper(ProfileMapper.class);
		int id=Integer.parseInt(request.getParameter("id"));
		System.out.println(id+"id值");
		List<Profile> list=profileMapper.findProfileById(id);
		System.out.println(list+"进来了.....");
		ActionContext.getContext().getSession().put("proInfo", list);
		return "show";
	}
}
*/