package com.kh.testSpring.di.anno.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.kh.testSpring.di.anno.vo.Person;

public class PersonAnnoTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("anno.xml");
		
		Person p = (Person)context.getBean("person");
		
		p.printPerson();
		
	}
}
