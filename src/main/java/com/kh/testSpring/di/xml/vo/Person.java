package com.kh.testSpring.di.xml.vo;

public class Person {
	// xml 방식을 통한 의존성 주입 테스트 객체
	
	// 1. Field member
	private String name;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Job getMyJob() {
		return myJob;
	}

	public void setMyJob(Job myJob) {
		this.myJob = myJob;
	}
	
}
