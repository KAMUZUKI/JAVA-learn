package com.mu.servlet;

import com.mu.service.Impl.UserServiceImpl;
import com.mu.service.UserService;

/**
 * @author : MUZUKI
 * @date : 2023-02-21 19:53
 **/

public class UserAction {
    private UserService userService = new UserServiceImpl();

//    private UserService userService;

    /**
     * 删除用户信息的请求
     */
    public void deleteRequest(){
        userService.deleteUserById();
    }
}
