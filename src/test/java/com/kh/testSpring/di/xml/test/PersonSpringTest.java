package com.kh.testSpring.di.xml.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kh.testSpring.di.xml.vo.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:beans.xml")
public class PersonSpringTest {
	// junit 확장판, 즉 junit의 기능을 추가하소
	// 더욱 활용성을 높인 sping-test
	
	@Autowired
	ApplicationContext context;
	
	@Test
	public void test1() {
		
		Person p1 = (Person)context.getBean("person1");
		Person p2 = (Person)context.getBean("person2");
		assertEquals(p1,p2);
		asertSame(p1,p2);
		
	}

	private void asertSame(Person p1, Person p2) {
		// TODO Auto-generated method stub
		
	}
}
