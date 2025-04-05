package com.saewoo.bootstrap.kanban;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.saewoo.kanban")
@EnableFeignClients(basePackages = "com.saewoo.common.client")
public class BootstrapKanbanServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapKanbanServiceApplication.class, args);
	}

}
