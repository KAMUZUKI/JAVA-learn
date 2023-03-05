package com.mu.demo.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

/**
 * @author : MUZUKI
 * @date : 2023-03-05 10:15
 **/

@Configuration
public class JedisUtils {
    @Value("${redis.host}")
    private static final String REDIS_HOST = "redis.host";

    @Value("${redis.port}")
    private static final String REDIS_PORT = "redis.port";

    public static Jedis getReadisInstance(){
        return new Jedis(REDIS_HOST,Integer.parseInt(REDIS_PORT));
    }
}
