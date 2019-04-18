package com.sxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DemoController {
	@RequestMapping("/show")
	public String showInfo(){
		String str=null;
		str.length();
		return "index";
	}
}
