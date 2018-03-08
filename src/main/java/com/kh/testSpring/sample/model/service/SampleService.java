package com.kh.testSpring.sample.model.service;

import com.kh.testSpring.sample.model.vo.User;

public interface SampleService {

	public void selectOne(String name);
	public void selectList();
	public void insertUser(User user);
	public void updateUser(User user);
	public void deleteUser(String name);
}
