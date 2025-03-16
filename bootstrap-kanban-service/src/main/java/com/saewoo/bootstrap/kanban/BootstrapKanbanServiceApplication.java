package com.saewoo.bootstrap.kanban;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.saewoo.kanban")
public class BootstrapKanbanServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapKanbanServiceApplication.class, args);
	}

}
