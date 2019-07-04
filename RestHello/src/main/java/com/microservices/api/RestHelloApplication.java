package com.microservices.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RestHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestHelloApplication.class, args);
	}

}
