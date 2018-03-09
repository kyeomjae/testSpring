package com.kh.testSpring.sample.model.service;

import java.util.ArrayList;

import com.kh.testSpring.sample.model.vo.Member;
import com.kh.testSpring.sample.model.vo.User;

public interface SampleService {

	public void selectOne(String name);
	public ArrayList<Member> selectList();
	public void insertUser(User user);
	public void updateUser(User user);
	public void deleteUser(String name);
}
