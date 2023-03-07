package com.mu.demo.config;

import org.springframework.beans.factory.annotation.Value;
<<<<<<< HEAD
import org.springframework.stereotype.Component;

/**
 * @author MUZUKI
 * @Classname JedisConfig
 * @Description TODO
 * @Date 2023/3/6 22:19
 */

@Component
public class JedisConfig {
    @Value("${redis.host}")
    private String REDIS_HOST;

    @Value("${redis.port}")
    private String REDIS_PORT;

    public String getREDIS_HOST() {
        return REDIS_HOST;
    }

    public int getREDIS_PORT() {
        return (Integer.parseInt(REDIS_PORT));
    }
}
