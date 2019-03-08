package com.example.springboot_test_3_consumer.controller.Feign;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.springboot_test_3_consumer.FeignService.HiService;

@RestController
public class HiController {
	@Resource
	private HiService hiService;
	
    @RequestMapping("/hi")
    public String sayInfo(@RequestParam(defaultValue="xiongyan",required=false) String name) {
        return hiService.sayHi(name);
    }

}
