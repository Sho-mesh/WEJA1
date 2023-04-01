package com.jspiders.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	
	@GetMapping("/home")
	public String home() {
		return "Home";
	}
	
	@GetMapping("/add")
	public String addPage() {
		return "Add";
	}

}