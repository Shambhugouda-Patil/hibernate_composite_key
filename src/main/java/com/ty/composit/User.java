package com.ty.composit;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class User {
	private String name;
	private int age;
	private String gender;
	private int password;
	@EmbeddedId
	private UserId userId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public UserId getUserId() {
		return userId;
	}
	public void setUserId(UserId userId) {
		this.userId = userId;
	}
	
	
	

}
