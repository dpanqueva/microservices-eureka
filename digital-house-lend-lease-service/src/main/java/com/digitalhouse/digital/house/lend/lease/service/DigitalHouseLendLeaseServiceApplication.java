package com.digitalhouse.digital.house.lend.lease.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DigitalHouseLendLeaseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalHouseLendLeaseServiceApplication.class, args);
	}

}
