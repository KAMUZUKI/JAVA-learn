package com.mu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MUZUKI
 */
@RestController
public class TestChoose {
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/testChoose")
    public String testChoose(String serviceId) {
        ServiceInstance choose = loadBalancerClient.choose(serviceId);
        System.out.println(choose.getHost() + ":" + choose.getPort());
        return choose.toString();
    }
}
