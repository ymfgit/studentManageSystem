package com.yc.mybatis.entity;

public class Profile {
	private int id;
	private String name;
	private String birthday;//
	private String gender;//性别
	private String career;//职业
	private String address;//地址
	private String mobile;//手机
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Profile(int id, String name, String birthday, String gender,
			String career, String address, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.career = career;
		this.address = address;
		this.mobile = mobile;
	}
	public Profile() {
		super();
	}
	@Override
	public String toString() {
		return "Profile [id=" + id + ", name=" + name + ", birthday="
				+ birthday + ", gender=" + gender + ", career=" + career
				+ ", address=" + address + ", mobile=" + mobile + "]";
	}
	
	
	
	
}
