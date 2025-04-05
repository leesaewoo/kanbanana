package com.saewoo.bootstrap.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.saewoo.search")
@EnableFeignClients(basePackages = "com.saewoo.common.client")
public class BootstrapSearchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapSearchServiceApplication.class, args);
	}

}
