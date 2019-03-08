package com.example.springboot_test_3_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class SpringbootTest3ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTest3ConsumerApplication.class, args);
	}

}
