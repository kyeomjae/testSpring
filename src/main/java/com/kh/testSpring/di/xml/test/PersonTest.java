package com.kh.testSpring.di.xml.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.kh.testSpring.di.xml.vo.Person;

public class PersonTest {

	public static void main(String[] args) {
		// xml에 저장한 객체 정보를 받아오기 위한
		// IoC 컨테이너 객체 생성
		ApplicationContext context 
		  = new GenericXmlApplicationContext("beans.xml");
		
		// 생성한 IoC 컨테이너가 관리하는 객체 'person1'을 받아옴
		Person p1 = (Person) context.getBean("person1");
		p1.printPerson();
		p1.getMyJob().jobInfo("KH");
		
		Person p3 = (Person) context.getBean("person1");
		System.out.println("p1 == p3 ? "+ (p1 == p3) );
		
		// 생성자를 통해 객체를 생성함
		Person p2 = (Person) context.getBean("person2");
		p2.printPerson();
		p2.getMyJob().jobInfo("KFC");
		
		Person p4 = (Person) context.getBean("person2");
		System.out.println("p2 == p4 ? "+ (p2 == p4));
		
		// 싱글톤 패턴으로 관리되고 있음
		// 싱글톤 패턴이란, 여기저기서 쓰일 수 있는 객체를
		// 공유 객체(static)로 선언하여 어디서든 동일한
		// 객체를 불러올 수 있는 것을 뜻함
		
	}
}









