package com.mu.demo;

import com.mu.demo.utils.JedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;

/**
 * @author MUZUKI
 * @Classname JedisTest
 * @Description TODO
 * @Date 2023/3/6 21:05
 */

@SpringBootTest
public class JedisTest {

    @Autowired
    private JedisUtils jedisUtils;

    @Test
    void contextLoads() {
        Jedis jedis = jedisUtils.getRedisInstance();
        System.out.println(jedisUtils);
        System.out.println(jedis);
    }

    @Test
    void test(){
        ValueTest valueTest = new ValueTest();
        valueTest.getValue();
    }

    @Test
    void test2(){
        TestDemo testDemo = new TestDemo();
        System.out.println(testDemo);
    }
}
