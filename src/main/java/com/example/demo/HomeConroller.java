package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeConroller {

	@GetMapping("/home")
	public String Home() {
		System.out.println("hello");
		return "welcome to GitHub learning ....!!!!!";
	}
	@GetMapping("/homeB")
	public String HomeB() {
		return "welcome to GitHub learning";
	}
	

	@GetMapping("/homeA")
	public String HomeA() {


		return "welcome to GitHub learning naga";



	}
	
}
