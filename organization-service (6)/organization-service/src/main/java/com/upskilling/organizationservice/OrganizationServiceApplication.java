package com.upskilling.organizationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title= "Springboot Rest API Documentation",
				description="swagger",
				version="v1.0",
				contact = @Contact(
						name = "Kamini",
						email = "kamini@gmail.com"
//						url = "https://www.javaguides.net"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.javaguides.net/license"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot Organization Service Documentation",
				url = "https://www.javaguides.net/user_management.html"

		)
)
public class OrganizationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganizationServiceApplication.class, args);
	}

}
