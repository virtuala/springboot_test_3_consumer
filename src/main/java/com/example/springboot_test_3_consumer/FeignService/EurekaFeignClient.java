package com.example.springboot_test_3_consumer.FeignService;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="SPRINGBOOT-TEST-3-SERVER",configuration=FeignConfig.class)
public interface EurekaFeignClient {
	
    @GetMapping("/hi")
    public String sayHiFromClientEureka(@RequestParam(value="name") String name);

}
