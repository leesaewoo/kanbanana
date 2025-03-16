package com.saewoo.bootstrap.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.saewoo.user")
public class BootstrapUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapUserServiceApplication.class, args);
	}

}
