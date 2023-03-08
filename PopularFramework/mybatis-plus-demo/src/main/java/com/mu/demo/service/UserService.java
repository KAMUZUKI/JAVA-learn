package com.mu.demo.service;

import com.mu.demo.web.model.JsonModel;

import javax.servlet.http.HttpServletRequest;

/**
* @author MUZUKI
* @description 针对表【user】的数据库操作Service
* @createDate 2023-03-05 19:12:56
*/
public interface UserService{
    /**
     * 用户登录
     * @return 登录结果
     */
    JsonModel login(HttpServletRequest request);

    /**
     * 用户注册
     * @return 注册结果
     */
    JsonModel register(HttpServletRequest request);

    /**
     * 获取所有用户
     * @return 用户列表
     */
    JsonModel getAllUser();

    /**
     * 获取用户喜欢的文章列表
     * @param request 请求
     * @return 喜欢的文章列表
     */
    JsonModel getLikeList(HttpServletRequest request);
}
