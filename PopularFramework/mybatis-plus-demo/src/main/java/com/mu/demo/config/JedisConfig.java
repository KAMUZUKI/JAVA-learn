package com.mu.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author : MUZUKI
 * @date : 2023-03-05 10:15
 **/
@Component
@ConfigurationProperties(prefix = "redis")
@PropertySource(value = { "classpath:application.yaml" })
public class JedisConfig {
    public static String REDIS_HOST;

    public static Integer REDIS_PORT;

    @Value("${port}")
    public void setRedisPort(Integer redisPort) {
        REDIS_PORT = redisPort;
    }

    @Value("${host}")
    public void setRedisHost(String redisHost) {
        REDIS_HOST = redisHost;
    }
}
