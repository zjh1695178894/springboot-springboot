package com.bjsxt.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjsxt.pojo.Users;

@Controller
public class UsersController {
	@RequestMapping("/addUser")
	public String showPage(Users user){
		return "add";
	}
	@RequestMapping("/save")
	//@Valid开启对Users类的数据校验
	//BindingResult封装校验的结果
	public String saveUser(@Valid Users user,BindingResult result){
		if(result.hasErrors()){
			return "add";
		}
		System.out.println(user.toString());
		return "ok";
	}
}
