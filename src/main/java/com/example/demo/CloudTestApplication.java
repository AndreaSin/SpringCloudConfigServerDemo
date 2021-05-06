package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudTestApplication.class, args);
		
		// http://localhost:8888/app1/deafault
	}

}
