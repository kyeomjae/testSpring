package com.kh.testSpring.sample.model.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.testSpring.sample.model.vo.Member;
import com.kh.testSpring.sample.model.vo.User;

@Repository("sampleDao")
public class SampleDaoImpl implements SampleDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	@Autowired
	private User user;
	
	@Override
	public void selectOne(String name) {

		System.out.println("selectOne DAO 호출");
		System.out.println(user);
		
		User user2= new User();
		System.out.println(user2);
	}

	@Override
	public ArrayList<Member> selectList() {

		return new ArrayList<Member>(sqlSession.selectList("Member.selectList"));
	}

	@Override
	public int insertUser(User user) {
		return 0;
	}

	@Override
	public int updateUser(User user) {
		return 0;
	}

	@Override
	public int deleteUser(String name) {
		return 0;
	}

}
