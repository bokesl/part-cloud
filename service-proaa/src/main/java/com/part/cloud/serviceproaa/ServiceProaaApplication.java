package com.part.cloud.serviceproaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceProaaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProaaApplication.class, args);
	}

	@GetMapping("/actuator/health")
	public String health(){
		return "hello";
	}

}
