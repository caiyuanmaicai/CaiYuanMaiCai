package com.maicai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maicai.service.TestService;

@RequestMapping("/test")
@RestController
public class TestController {

	@Autowired
	private TestService testService;

	@RequestMapping("/test")
	public String test() {

		return testService.test();
	}
	
}
