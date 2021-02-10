package com.cjc.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String preLogin()
	{
		return "login";
	}
	@RequestMapping("/log")
	public String login(@RequestParam("uname")String uname,@RequestParam("pass")String pass,Model m)
	{
		System.out.println(uname);
		System.out.println(pass);
		m.addAttribute("data", uname);
		m.addAttribute("data1",pass);
		return "success";
	}
}
