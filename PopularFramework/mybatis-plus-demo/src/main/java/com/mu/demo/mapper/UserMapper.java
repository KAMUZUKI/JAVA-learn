package com.mu.demo.mapper;

import com.mu.demo.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author MUZUKI
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-03-02 20:33:40
* @Entity generator.domain.User
*/
public interface UserMapper extends BaseMapper<User> {
    List<User> getAllUsers();
}




