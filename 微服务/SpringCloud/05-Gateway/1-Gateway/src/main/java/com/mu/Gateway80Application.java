package com.mu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author MUZUKI
 * 网关也是eureka的客户端
 */
@SpringBootApplication
@EnableEurekaClient
public class Gateway80Application {

    public static void main(String[] args) {
        SpringApplication.run(Gateway80Application.class, args);
    }

}
