package com.restapi.pocrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.restapi")
public class PocRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocRestApplication.class, args);
	}
}
