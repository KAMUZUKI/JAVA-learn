package com.mu.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mu.demo.domain.User;
import com.mu.demo.mapper.UserMapper;
import com.mu.demo.service.UserService;
import com.mu.demo.web.model.JsonModel;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
* @author MUZUKI
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-03-05 19:20:49
*/
@Service
public class UserServiceImpl implements UserService {

    @Override
    public JsonModel getAllUser() {
        return null;
    }

    @Override
    public JsonModel getLikeList(HttpServletRequest request) {
        return null;
    }
}




