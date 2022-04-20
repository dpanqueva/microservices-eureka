package com.digitalhouse.digital.house.gateway.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DigitalHouseGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalHouseGatewayServiceApplication.class, args);
	}

}
