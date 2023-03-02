package com.mu.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mu.demo.domain.User;
import com.mu.demo.service.UserService;
import com.mu.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
* @author MUZUKI
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-03-02 20:33:40
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{
    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public Map<Integer, User> getAllUsers() {
        userMapper.getAllUsers();
        return null;
    }
}




