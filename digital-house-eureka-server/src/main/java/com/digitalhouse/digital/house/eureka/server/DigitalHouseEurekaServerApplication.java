package com.digitalhouse.digital.house.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DigitalHouseEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalHouseEurekaServerApplication.class, args);
	}

}
