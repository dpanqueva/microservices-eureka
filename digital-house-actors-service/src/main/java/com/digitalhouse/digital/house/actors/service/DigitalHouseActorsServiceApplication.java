package com.digitalhouse.digital.house.actors.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DigitalHouseActorsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalHouseActorsServiceApplication.class, args);
	}

}
