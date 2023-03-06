package com.mu.demo.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import redis.clients.jedis.Jedis;

import static redis.clients.jedis.HostAndPort.localhost;

/**
 * @author : MUZUKI
 * @date : 2023-03-05 10:15
 **/
@Controller
public class JedisUtils {
    @Value("${redis.host}")
    private String REDIS_HOST = "localhost";

    @Value("${redis.port}")
    private Integer REDIS_PORT = 6379;

    public Jedis getRedisInstance(){
        return new Jedis(REDIS_HOST,REDIS_PORT);
    }
}
