package com.mu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author MUZUKI
 * EnableFeignClients  标记feign的客户端
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OpenFeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignConsumerApplication.class, args);
    }

}
