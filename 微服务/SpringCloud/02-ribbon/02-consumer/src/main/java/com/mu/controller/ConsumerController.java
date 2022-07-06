package com.mu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author MUZUKI
 */

@RestController
public class ConsumerController {
        @Autowired
        private RestTemplate restTemplate;

        @GetMapping("testBalance")
        public String testBalance(String serviceName) {
            return restTemplate.getForObject("http://" + serviceName + "/hello",String.class);
        }
}
