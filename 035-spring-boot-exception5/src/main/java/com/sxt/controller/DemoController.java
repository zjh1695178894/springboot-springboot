package com.sxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DemoController {
	@RequestMapping("/show")
	public String showInfo(){
		String str=null;
		str.length();
		return "index";
	}
	@RequestMapping("/show2")
	public String showInfo2(){
		int i=10/0;
		return "index";
	}
}
