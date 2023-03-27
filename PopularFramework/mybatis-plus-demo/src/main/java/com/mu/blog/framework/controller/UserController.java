package com.mu.blog.framework.controller;

import com.mu.blog.framework.domain.User;
import com.mu.blog.framework.service.impl.UserServiceImpl;
import com.mu.blog.framework.utils.HttpUtils;
import com.mu.blog.framework.model.JsonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author MUZUKI
 * @Classname UserController
 * @Description TODO
 * @Date 2023/3/26 1:58
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/login")
    public JsonModel login(HttpServletRequest request) {
        JsonModel jm = new JsonModel();
        String username = request.getParameter("account");
        String password = request.getParameter("password");
        User user = userService.login(username,password);
        if (user == null) {
            jm.setCode(0).setMsg("用户名或密码错误");
        }else {
            jm.setCode(1).setMsg("登录成功").setData(user);
        }
        return jm;
    }

    @RequestMapping(value = "/updateUserById")
    public JsonModel updateUserById(HttpServletRequest request) {
        User user = HttpUtils.parseRequestToT(request,User.class);
        JsonModel jm = new JsonModel();
        if (userService.updateUserById(user) == 1) {
            jm.setCode(1).setMsg("修改成功");
        }else {
            jm.setCode(0).setMsg("修改失败");
        }
        return jm;
    }

    @RequestMapping(value = "/register")
    public JsonModel register(HttpServletRequest request) {
        User user = HttpUtils.parseRequestToT(request,User.class);
        JsonModel jm = new JsonModel();
        if (userService.register(user) == 1) {
            jm.setCode(1).setMsg("注册成功");
        }else {
            jm.setCode(0).setMsg("注册失败");
        }
        return jm;
    }

    @RequestMapping(value = "/getAllUser")
    public JsonModel getAllUser() {
        JsonModel jm = new JsonModel();
        jm.setCode(1).setData(userService.getAllUser());
        return jm;
    }

    @RequestMapping(value = "/getLikeList")
    public JsonModel getLikeList(HttpServletRequest request) {
        JsonModel jm = new JsonModel();
        int id = Integer.parseInt(request.getParameter("userId"));
        jm.setCode(1).setData(userService.getLikeList(id));
        return jm;
    }
}
