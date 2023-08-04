package com.nepstaff.webappdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    @ResponseBody
    public String sayHello()
    {
    	// Create, Update, Delete
        return "Hello from SpringBoot Controller";
    }

    @GetMapping("/welcome")
    public String getWelcomePage()
    {
        return "welcome";
    }
}
