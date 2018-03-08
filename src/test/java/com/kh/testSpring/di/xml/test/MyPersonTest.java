package com.kh.testSpring.di.xml.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.kh.testSpring.di.xml.vo.Person;

public class MyPersonTest {
	// test 도구 junit 사용하기
	
	// 단위 test를 구현하기 위한 어노테이션
	// @Before : 테스트 전에 수행할 메소드 
	// @Test : 특정 테스트를 수행하기 위한 메소드
	// @After : 테스트 이후에 수행할 메소드
	
	ApplicationContext context;
	
	@Before // test 전 수행하는 메소드
	public void init() {
		context = new GenericXmlApplicationContext("beans.xml");
	}
	
	@Test // 실제 테스트를 수행하는 메소드
	public void test1() {
		Person p1 = (Person)context.getBean("person1");
		
		// 단위 테스트 에서 수행할 수 있는 메소드
		// assertEquals(예상하는 값, 실제 수행되는 값)
		assertEquals("김윤환",p1.getName());
		// "김윤환".equals("홍길동"); == > false
		
	}
	
	@After // 테스트가 끝난 뒤에 실행되는 메소드
	public void destroy() {
		System.out.println("테스트가 종료 되었습니다.");
	}
	
	
	
	
}









