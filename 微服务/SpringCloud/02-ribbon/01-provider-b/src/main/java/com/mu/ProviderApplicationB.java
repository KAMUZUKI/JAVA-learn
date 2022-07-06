package com.mu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author MUZUKI
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderApplicationB {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplicationB.class, args);
    }

}
