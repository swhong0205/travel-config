package com.coupang.travelconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class TravelConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelConfigApplication.class, args);
	}
}
