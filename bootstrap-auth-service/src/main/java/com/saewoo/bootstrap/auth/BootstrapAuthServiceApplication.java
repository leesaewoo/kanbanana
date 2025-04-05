package com.saewoo.bootstrap.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.saewoo.auth"})
@EnableFeignClients(basePackages = "com.saewoo.common.client")
public class BootstrapAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapAuthServiceApplication.class, args);
	}

}
