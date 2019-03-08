package com.example.springboot_test_3_consumer.FeignService;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HiService {
	@Resource
	private EurekaFeignClient eurekaFeignClient;
	
    public String sayHi(String name) {
        return this.eurekaFeignClient.sayHiFromClientEureka(name);
    }

}
