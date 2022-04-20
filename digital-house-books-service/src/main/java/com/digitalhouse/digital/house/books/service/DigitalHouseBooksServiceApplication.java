package com.digitalhouse.digital.house.books.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DigitalHouseBooksServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalHouseBooksServiceApplication.class, args);
	}

}
