package com.example.eurekaprovider.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class HelloController {

    private final Logger logger= Logger.getLogger("hello");


    @Autowired
    private DiscoveryClient client; // 服务发现客户端
    @RequestMapping("/hello")
    public String index(){

        logger.info("s");
        return "hello world";
    }
}
