package com.tm.spring_2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/test",method = RequestMethod.GET)
	public String test() {
		System.out.println("test실행");
		return "test";
	}
	@RequestMapping(value = "/test2",method = RequestMethod.GET)
	public String test2() {
		System.out.println("test2실행");
		return "test2";
	}
	@RequestMapping(value = "/test3",method = RequestMethod.GET)
	public String test3() {
		System.out.println("test3실행");
		return "sub/test3";
	}
	
}








