package com.sxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UsersController {
	@RequestMapping("/showUser1")
	public String showUsers(){
		String str=null;
		str.length();
		return "index";
	}
	@RequestMapping("/showUser2")
	public String showYsers2(){
		int i=10/0;
		return "index";
	}
}
