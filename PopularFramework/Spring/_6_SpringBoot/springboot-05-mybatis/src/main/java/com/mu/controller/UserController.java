package com.mu.controller;

import com.mu.mapper.UserMapper;
import com.mu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserMapper userMapper;

    @GetMapping("/queryUserList")
    public List<User> queryList(){
        List<User> list = userMapper.queryUserList();
        for(User user : list){
            System.out.println(user);
        }
        return list;
    }

    @GetMapping("/queryUser")
    public User queryUser(){
        return userMapper.queryUser(4);
    }

    @GetMapping("/addUser")
    public String addUser(){
        userMapper.addUser(new User(11,"张三","lsahjkjf"));
        return "addUser OK";
    }

    @GetMapping("/deleteUser")
    public String deleteUser(){
        userMapper.deleteUser(5);
        return "delete OK";
    }

    @GetMapping("/updateUser")
    public String updateUser(){
        userMapper.updateUser(new User(10,"王五","hjlsadk"));
        return "update OK";
    }

}
