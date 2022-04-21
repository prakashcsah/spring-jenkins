package com.jenkins.spring;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void init() {
		LOGGER.info("Application started.....");
	}

	public static void main(String[] args) {
		LOGGER.info("Application executed.....");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

	@GetMapping("/ping")
	public String message() {
		return "Wao!! Application Deployed successfully....";
	}
}
