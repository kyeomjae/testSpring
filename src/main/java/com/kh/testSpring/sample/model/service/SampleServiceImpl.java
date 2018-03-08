package com.kh.testSpring.sample.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.testSpring.sample.model.dao.SampleDao;
import com.kh.testSpring.sample.model.vo.User;

@Service("sampleService")
public class SampleServiceImpl implements SampleService {

	@Autowired
	
	private SampleDao sampleDao;
	
	
	@Override
	public void selectOne(String name) {
		System.out.println("selectOne() 서비스 호출");
		sampleDao.selectOne("홍길동");
	}

	@Override
	public void selectList() {
		
	}

	@Override
	public void insertUser(User user) {
		
	}

	@Override
	public void updateUser(User user) {
		
	}

	@Override
	public void deleteUser(String name) {
		
	}

}
