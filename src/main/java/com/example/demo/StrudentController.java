package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class StrudentController {

	
	@GetMapping("/homeB")
	public String HomeB() {
		return "welcome to GitHub learning";
	}
}
