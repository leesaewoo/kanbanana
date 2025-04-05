package com.saewoo.bootstrap.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.saewoo.notification"})
@EnableFeignClients(basePackages = "com.saewoo.common.client")
public class BootstrapNotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapNotificationServiceApplication.class, args);
	}

}
