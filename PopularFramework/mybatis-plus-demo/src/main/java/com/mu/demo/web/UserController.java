package com.mu.demo.web;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mu.demo.mapper.UserMapper;
import com.mu.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author : MUZUKI
 * @date : 2023-03-02 19:18
 **/

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired(required = false)
    private UserMapper userMapper;

    @RequestMapping(value = "/getAllUser")
    protected List<Map<String, Object>> getAllUser(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id","name","account");
        List<Map<String, Object>> userMap = userMapper.selectMaps(queryWrapper);
        return userMap;
    }

    /**
     * article.action?op=deleteArticle
     * 删除文章
     */
    @RequestMapping(value = "/hello")
    protected void deleteArticle(){

    }
}
