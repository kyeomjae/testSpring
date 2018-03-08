package com.kh.testSpring.di.anno.vo;

import org.springframework.stereotype.Component;

@Component("programmer")
public class Programmer implements Job {

	@Override
	public void jobInfo(String comp) {
		System.out.println(comp+" 에서 개발 업무 중...");
	}

}
