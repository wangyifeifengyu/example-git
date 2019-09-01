package com.example.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ExampleGitApplication {

	@RequestMapping("/")
	public String name(){
		return "Hello git v8 --commit to github update from";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ExampleGitApplication.class, args);
	}
}
