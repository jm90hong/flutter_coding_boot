package com.my.flutter_coding_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {
	
	
	
	
	@GetMapping("/")
	public @ResponseBody String home() {
		
		return "ok";
	}
}
