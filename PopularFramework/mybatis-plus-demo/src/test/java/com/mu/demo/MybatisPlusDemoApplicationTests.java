package com.mu.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.mu.demo.domain.User;
import com.mu.demo.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MybatisPlusDemoApplicationTests {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        List<User> allUsers = userMapper.selectList(queryWrapper);
        System.out.println(allUsers);
    }

    @Test
    public void test3(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select().likeRight("name", "张").likeRight("type","1");
        List<User> userList = userMapper.selectList(queryWrapper);
        System.out.println(userList);
    }
}