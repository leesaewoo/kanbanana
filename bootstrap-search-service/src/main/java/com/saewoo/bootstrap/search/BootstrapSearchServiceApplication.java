package com.saewoo.bootstrap.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.saewoo.search")
public class BootstrapSearchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapSearchServiceApplication.class, args);
	}

}
