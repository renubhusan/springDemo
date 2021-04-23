package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeConroller {

	@GetMapping("/home")
	public String Home() {
		return "welcome to GitHub learning ....!!!!!";
	}
	@GetMapping("/homeB")
	public String HomeB() {
		return "welcome to GitHub learning";
	}
	

	@GetMapping("/homeA")
	public String HomeA() {

System.out.println("helllllllllllooooooooooooo");
		return "welcome to GitHub learning naga>>>>>>>>>>>>";



	}
	
}
