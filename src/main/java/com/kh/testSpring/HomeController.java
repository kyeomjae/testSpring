package com.kh.testSpring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "home1.do", method = RequestMethod.GET)
	
	// @RequestMapping을 통해 view에서 전달 받은 url이
	// 해당 메소드로 전달된다.
	// value : 전달받은 url이 작성된 url과 일치하면
	//         해당 메소드를 실행시킨다.
	// method : HTTP 통신을 구현할 때 사용할 메시지 타입
	//          GET, POST
	
	public String home1(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home"; // -----> /WEB-INF/views/home.jsp
	}
	
	@RequestMapping(value="home2.do", method=RequestMethod.GET)
	public String home2(Locale locale, Model model) {
		logger.info("어서요세요, 반갑습니다. {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
}
