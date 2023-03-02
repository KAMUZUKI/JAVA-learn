package com.mu.demo.service;

import com.mu.demo.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
* @author MUZUKI
* @description 针对表【user】的数据库操作Service
* @createDate 2023-03-02 20:33:40
*/
public interface UserService extends IService<User> {
    Map<Integer, User> getAllUsers();
}
