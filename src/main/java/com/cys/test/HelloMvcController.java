package com.cys.test;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class HelloMvcController {
	
	@RequestMapping("/mvc")
	public String helloMvc(){
		return "home";
	}
}
