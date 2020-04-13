package com.tm.spring_2.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member/**")
public class MemberController {

	@RequestMapping(value = "memberJoin",method = RequestMethod.GET)
	public void memberJoin() {
		System.out.println("memberJoinForm");
	}
	
	@RequestMapping(value = "memberJoin",method = RequestMethod.POST)
	public String memberJoin2() {
		System.out.println("memberJoinDB");
		
		return "redirect:../";
	}
	
	
	@RequestMapping(value = "memberLogin",method = RequestMethod.GET)
	public void memberLogin() {
		System.out.println("memberLoginForm");
	}
	
	@RequestMapping(value = "memberLogin",method = RequestMethod.POST)
	public String memberLogin2() {
		System.out.println("memberLoginDB");
		
		return "redirect:../";
	}
	
	@RequestMapping(value = "memberDelete",method = RequestMethod.GET)
	public String memberDelete() {
		System.out.println("memberDelete");
		
		return "redirect:../";
	}
	
	@RequestMapping(value = "memberUpdate",method = RequestMethod.GET)
	public void memberUpdate() {
		System.out.println("memberUpdateForm");
	}
	
	@RequestMapping(value = "memberUpdate",method = RequestMethod.POST)
	public String memberUpdate2() {
		System.out.println("memberUpdateDB");
		
		return "redirect:./memberPage";
	}
	
	@RequestMapping(value = "memberPage",method = RequestMethod.GET)
	public void memberSelect() {
		System.out.println("memberPage");
	}
	
}
