package com.mu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author MUZUKI
 * EnableEurekaClient  标记此服务为eureka客户端
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClient02Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient02Application.class, args);
    }

}
