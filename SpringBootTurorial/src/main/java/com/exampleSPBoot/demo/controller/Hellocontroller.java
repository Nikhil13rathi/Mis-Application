package com.exampleSPBoot.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class Hellocontroller {
	
	@GetMapping("/")
	public String helloWorld() {
		System.out.println("Are you working");
		return "Welcome Mr Nikhil Rathi";
	}
}
