package com.spring.boot.demo.springbootsimpledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

	@RequestMapping("/jenkins")
	public String test(){
		return "jenkins build success";
	}

	@RequestMapping("/jenkins2")
	public String test2(){
		return "jenkins2 build success 2222222";
	}
}
