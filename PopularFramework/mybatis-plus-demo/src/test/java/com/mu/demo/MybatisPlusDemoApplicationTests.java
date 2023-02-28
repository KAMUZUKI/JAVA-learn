package com.mu.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mu.demo.mapper.UserMapper;
import com.mu.demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.management.Query;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MybatisPlusDemoApplicationTests {

    @Autowired
    private UserMapper mapper;

    @Test
    public void testSelect() {
        List<User> list = mapper.selectList(null);
        assertEquals(5, list.size());
        list.forEach(System.out::println);
    }

    @Test
    public void test3(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id","name","age").likeRight("name","黄");
        mapper.selectMaps(queryWrapper).forEach(System.out::println);
    }
}