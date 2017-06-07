package com.goihram.haj.trackerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.goihram.haj.trackerservice")
public class TrackerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrackerServiceApplication.class, args);
	}
}
