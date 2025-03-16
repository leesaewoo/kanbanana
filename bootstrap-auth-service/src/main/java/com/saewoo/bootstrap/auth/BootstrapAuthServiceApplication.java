package com.saewoo.bootstrap.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.saewoo.auth"})
public class BootstrapAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapAuthServiceApplication.class, args);
	}

}
