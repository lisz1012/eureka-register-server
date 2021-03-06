package com.lisz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer // Eureka服务端必备
@SpringBootApplication
public class EurekaRegisterServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaRegisterServerApplication.class, args);
	}
}
