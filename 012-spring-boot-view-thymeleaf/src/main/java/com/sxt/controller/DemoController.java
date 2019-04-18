package com.sxt.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sxt.pojo.User;

@Controller
public class DemoController {
	@RequestMapping("/show")
	public String showInfo(Model model){
		model.addAttribute("msg", "thymeleaf的第一个案例");
		model.addAttribute("key",new Date());
		return "index";
	}
	@RequestMapping("/show2")
	public String showInfo2(Model model){
		model.addAttribute("sex","男");
		model.addAttribute("id", "2");
		return "index2";
	}
	@RequestMapping("/show3")
	public String showInfo3(Model model){
		List<User> list=new ArrayList<>();
		list.add(new User(1,"张三",22));
		list.add(new User(2,"李四",24));
		list.add(new User(3,"王五",20));
		model.addAttribute("list", list);
		return "index3";
	}
	@RequestMapping("/show4")
	public String showInfo4(Model model){
		Map<String,User> map=new HashMap<>();
		map.put("u1", new User(1,"张三",22));
		map.put("u2", new User(2,"李四",24));
		map.put("u3", new User(3,"王五",20));
		model.addAttribute("map",map);
		return "index4";
	}
	@RequestMapping("/show5")
	public String showInfo5(HttpServletRequest request,Model model){
		request.setAttribute("req", "HttpServletRequest");
		request.getSession().setAttribute("sess", "HttpSession");
		request.getSession().getServletContext().setAttribute("app", "Application");
		return "index5";
	}
}
