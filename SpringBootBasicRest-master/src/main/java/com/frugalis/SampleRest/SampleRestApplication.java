package com.frugalis.SampleRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.frugalis")
public class SampleRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleRestApplication.class, args);
	}
}
