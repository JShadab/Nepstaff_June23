package com.nepstaff.webappdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController = @Controller + @ResponseBody
@RestController
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from SpringBoot RestController";
	}
}
