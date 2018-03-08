package com.kh.testSpring.sample.model.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
	// DAO <--> Service <--> Controller간
	// 데이터 이동 시에 사용자 정보를 담기 위한 개게
	
	
	// IoC컨테이너에 의해 객체가 생성될 때
	// 객체에 기본 값을 널어주는 어노테이션
	@Value("없음")
	private String name;
	@Value("password")
	private String password;
	
	private int age;
	
	public User() {	}

	public User(String name, int age, String password) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", password=" + password + "]";
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
