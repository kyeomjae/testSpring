package com.kh.testSpring.di.anno.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	// xml 방식을 통한 의존성 주입 테스트 객체
	
	// 1. Field member
	
	// Value 어노테이션을 통해 내부에서 
	// IoC 컨테이너로 인해 XML 처리가 된다
	@Value("홍길동")
	private String name;
	
	// 객체를 자동으로 매친하여 의존성을 주입
	// 만약에 어떤 객체를 가져올 것인지 애매할 경우
	// Autowired에 Qualifier를 이용하여 명시해준다
	@Autowired
	@Qualifier("programmer")
	private Job myJob;
	
	// 2. Constructor
	public Person() { }
	
	public Person(String name, Job myJob) {
		this.name = name;
		this.myJob =myJob;
	}
	
	// 3. Method
	public void printPerson() {
		System.out.println(name+" : "+myJob);
	}

	// 4. Getter & Setter

	
	
}
