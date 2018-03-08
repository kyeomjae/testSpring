package com.kh.testSpring.sample.model.dao;

import com.kh.testSpring.sample.model.vo.User;

public interface SampleDao {

	public void selectOne(String name);
	public void selectList();
	public int insertUser(User user);
	public int updateUser(User user);
	public int deleteUser(String name);
}
