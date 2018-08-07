package com.example.pcfdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PcfDockerDemoApplication {

	@RequestMapping("/")
	public String hello() {
	  return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(PcfDockerDemoApplication.class, args);
	}
}
