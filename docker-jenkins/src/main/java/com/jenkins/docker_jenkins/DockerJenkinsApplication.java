package com.jenkins.docker_jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DockerJenkinsApplication {


	@GetMapping
	public String message(){
		return "Springboot-Docker-Jenkins";
	}


	public static void main(String[] args) {


		SpringApplication.run(DockerJenkinsApplication.class, args);
	}

}
