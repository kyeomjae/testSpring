package com.kh.testSpring.di.xml.vo;

public class ChickenMaker implements Job {

	@Override
	public void jobInfo(String comp) {
		System.out.println(comp+" 에서 치킨 굽는 중...");
	}

}
