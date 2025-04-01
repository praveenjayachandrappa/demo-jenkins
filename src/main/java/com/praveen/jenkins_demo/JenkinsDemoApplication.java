package com.praveen.jenkins_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

	public static void main(String[] args) {

		System.out.println("build started ....");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
