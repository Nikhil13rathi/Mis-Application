package com.exampleSPBoot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTurorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTurorialApplication.class, args);
		System.out.println("I am in main and executng");
	}

}
