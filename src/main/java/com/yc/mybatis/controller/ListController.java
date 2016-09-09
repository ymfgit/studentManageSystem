package com.yc.mybatis.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yc.mybatis.entity.Profile;
import com.yc.mybatis.service.ProfileService;


@Controller
public class ListController {
	@Autowired
	ProfileService profileService;
	
	//查询所有
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Map<String,Object> map){
		List<Profile> profile=profileService.findAllProfile();
		map.put("profile", profile);
	    return "list";
	}
	
	//根据id查看信息
	@RequestMapping(value="/showDetails",method=RequestMethod.GET)
	public String showDetails(@RequestParam(value="id")int id,Map<String,Object> map){
		List<Profile> profile=profileService.findProfileById(id);
		map.put("profile", profile);
		return "info";
	}
	
	//点击修改，到修改界面
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String update(@RequestParam(value="id")int id,HttpServletRequest request){
		List<Profile> profile=profileService.findProfileById(id);
		System.out.println("员工信息"+profile.get(0));
		request.getSession().setAttribute("profile", profile.get(0));
		
		return "update";
	}
	
	@RequestMapping("/updateDetails")
	public String updateDetails(Profile profile){
		int result=profileService.updateProfile(profile);
		System.out.println(result+"结果");
		if(result==1){
			return "success";
		}else{
			return "fail";
		}
	}
	
}
