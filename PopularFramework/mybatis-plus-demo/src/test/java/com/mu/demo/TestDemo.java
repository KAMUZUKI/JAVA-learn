package com.mu.demo;

import com.mu.demo.utils.JedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : MUZUKI
 * @date : 2023-03-07 19:00
 **/

@SpringBootTest
public class TestDemo {

    @Autowired
    JedisUtils jedisUtils;

    @Test
    public void test() {
        System.out.println(jedisUtils.getRedisInstance());
    }
}
