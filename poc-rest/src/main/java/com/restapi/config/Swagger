package com.restapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger {
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.restapi"))              
          .paths(PathSelectors.any())                          
          .build().apiInfo(metaInfo());                                           
    }
	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo("Rest API POC", "Using Spring Boot, Swagger, MongoDb, Spring Data ",
				"1.0", "Terms of Service",
				new Contact("pv", "url", "email"),
				"Apache License Version 2.0", "https://www.apache.org/licesen.html");

		return apiInfo;
	}
}
