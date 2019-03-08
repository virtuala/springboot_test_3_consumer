package com.example.springboot_test_3_consumer.FeignService;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Retryer;

@Configuration
public class FeignConfig {
	
    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default(100,TimeUnit.SECONDS.toMillis(1),5);
    }

}
