package com.saewoo.bootstrap.document;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.saewoo.document"})
public class BootstrapDocumentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapDocumentServiceApplication.class, args);
	}

}
