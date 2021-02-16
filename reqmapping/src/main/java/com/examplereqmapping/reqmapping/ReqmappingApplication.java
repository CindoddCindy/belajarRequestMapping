package com.examplereqmapping.reqmapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ReqmappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReqmappingApplication.class, args);
	}

}
