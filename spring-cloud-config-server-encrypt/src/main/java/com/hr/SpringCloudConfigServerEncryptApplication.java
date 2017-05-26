package com.hr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerEncryptApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerEncryptApplication.class, args);
	}
}
