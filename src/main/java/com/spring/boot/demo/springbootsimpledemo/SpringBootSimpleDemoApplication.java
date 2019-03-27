package com.spring.boot.demo.springbootsimpledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootSimpleDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSimpleDemoApplication.class, args);
	}

	@GetMapping({"/","/demo"})
	public String demo(){
		return "demo request success";
	}
}
