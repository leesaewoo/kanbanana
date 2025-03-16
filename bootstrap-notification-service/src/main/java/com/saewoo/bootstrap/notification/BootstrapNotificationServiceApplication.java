package com.saewoo.bootstrap.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.saewoo.notification"})
public class BootstrapNotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapNotificationServiceApplication.class, args);
	}

}
