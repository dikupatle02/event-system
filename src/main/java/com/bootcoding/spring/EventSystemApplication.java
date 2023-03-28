package com.bootcoding.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class EventSystemApplication {

	@Autowired
	private Marker marker;

	public static void main(String[] args) {
		SpringApplication.run(EventSystemApplication.class, args);

	}

}
