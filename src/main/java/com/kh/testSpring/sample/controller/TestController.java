package com.kh.testSpring.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kh.testSpring.sample.model.service.SampleService;

// @Component 에서 Controller 부분의 기본 설정을 추가한
// 자동 매핑 어노테이션
@Controller
public class TestController {

	@Autowired
	private SampleService sampleService;
	
	
	@RequestMapping(value="myinfo.do",method=RequestMethod.GET)
	public String testSelectOne(Model model) {
		System.out.println("TestController 도착");
		
		//request.setAttribute("결과로 전송될 값의 이름", 결과로 전송될 값);
		model.addAttribute("list",sampleService.selectList());
		
		return "home";
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping(value="home3.do", method=RequestMethod.GET)
	public String testMyHome(Model model) {
		
		System.out.println("내가 만든 Spring 컨트롤러");
		return "myHome";
	}	
}



