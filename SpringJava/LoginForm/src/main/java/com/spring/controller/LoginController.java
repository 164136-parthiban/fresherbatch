package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController 
{
	@RequestMapping("/submitForm")
	public String login()
	{
		return "login";
		
	}

}
