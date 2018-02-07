package com.restapi.config;
import java.util.Arrays;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.restapi.dao.PersonRepository;


@EnableMongoRepositories(basePackageClasses = PersonRepository.class)

@Configuration
public class MongoDBConfig {
	/**
	 * 
	 * @param userRepository
	 * @return
	 */
    }

