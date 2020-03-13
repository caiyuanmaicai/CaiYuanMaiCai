package com.maicai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/test")
@Controller("testController")
public class TestController {


	@RequestMapping("/test")
	public String test() {
		
		return "hello World";
	}
	
}
