package com.saewoo.bootstrap.document;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.saewoo.document"})
@EnableFeignClients(basePackages = "com.saewoo.common.client")
public class BootstrapDocumentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapDocumentServiceApplication.class, args);
	}

}
