package com.saewoo.bootstrap.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.saewoo.user")
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = "com.saewoo.user.repository")
@EntityScan(basePackages = "com.saewoo.common.entity")
@EnableFeignClients(basePackages = "com.saewoo.common.client")
public class BootstrapUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapUserServiceApplication.class, args);
	}

}
