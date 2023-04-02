package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class GcpJarApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcpJarApplication.class, args);
	}
	
	@GetMapping("/simpleRequest")
	public String simpleRequest(){
		return "ok";
	}

	@GetMapping("/echo")
	public String echo(@RequestParam (name="name") String echoText){
		return "Hello :"+echoText;
	}

}
