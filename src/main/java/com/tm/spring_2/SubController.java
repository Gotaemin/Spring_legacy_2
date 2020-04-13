package com.tm.spring_2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/sub/**")
public class SubController {

	
	@RequestMapping(value = "sub1", method = RequestMethod.GET)
	public String sub1() {
		return "sub/sub1";
	}
	
	@RequestMapping(value = "sub2",method = RequestMethod.GET)
	public String sub2() {
		return "sub/sub2";
	}
	
	
	
}
