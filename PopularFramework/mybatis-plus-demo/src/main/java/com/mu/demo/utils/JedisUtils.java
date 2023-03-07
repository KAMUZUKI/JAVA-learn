package com.mu.demo.utils;

import com.mu.demo.config.JedisConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

/**
 * @author : MUZUKI
 * @date : 2023-03-07 18:54
 **/
@Component
public class JedisUtils {

    @Autowired
    private JedisConfig jedisConfig;

    public Jedis getRedisInstance(){
        return new Jedis(jedisConfig.getREDIS_HOST(),jedisConfig.getREDIS_PORT());
    }
}
