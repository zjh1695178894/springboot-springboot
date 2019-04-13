package com.sxt.Controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sxt.pojo.User;

@Controller
public class UserController {
	@RequestMapping("/showUser")
	public String showUser(Model model){
		/*List<User> list=new ArrayList<>();
		list.add(new User(1,"张三",22));
		list.add(new User(2,"李四",24));
		list.add(new User(3,"王五",20));
		
		model.addAttribute("list",list);*/
		return "userList";
	}
}
