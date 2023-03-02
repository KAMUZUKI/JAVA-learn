package com.mu.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mu.demo.domain.User;
import com.mu.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Map;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MybatisPlusDemoApplicationTests {

    @Autowired(required = false)
    private UserService userService;

    @Test
    public void testSelect() {
        Map<Integer, User> allUsers = userService.getAllUsers();
        System.out.println(allUsers);
    }

    @Test
    public void test3(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id","name").likeRight("name","张");
    }
}