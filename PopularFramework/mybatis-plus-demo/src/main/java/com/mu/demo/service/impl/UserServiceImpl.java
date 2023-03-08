package com.mu.demo.service.impl;

import com.mu.demo.domain.User;
import com.mu.demo.service.UserService;
import com.mu.demo.utils.HttpUtils;
import com.mu.demo.web.UserDao;
import com.mu.demo.web.model.JsonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
* @author MUZUKI
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-03-05 19:20:49
*/
@RestController
@RequestMapping("/user")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @RequestMapping(value = "/login")
    public JsonModel login(HttpServletRequest request) {
        JsonModel jm = new JsonModel();
        String username = request.getParameter("account");
        String password = request.getParameter("password");
        User user = userDao.login(username,password);
        if (user == null) {
            jm.setCode(0).setMsg("用户名或密码错误");
        }else {
            jm.setCode(1).setMsg("登录成功").setData(user);
        }
        return jm;
    }

    @Override
    @RequestMapping(value = "/register")
    public JsonModel register(HttpServletRequest request) {
        User user = HttpUtils.parseRequestToT(request,User.class);
        JsonModel jm = new JsonModel();

        return null;
    }

    @Override
    @RequestMapping(value = "/getAllUser")
    public JsonModel getAllUser() {
        JsonModel jm = new JsonModel();
        jm.setCode(1).setData(userDao.getAllUser());
        return jm;
    }

    @Override
    @RequestMapping(value = "/getLikeList")
    public JsonModel getLikeList(HttpServletRequest request) {
        JsonModel jm = new JsonModel();
        int id = Integer.parseInt(request.getParameter("userId"));
        jm.setCode(1).setData(userDao.getLikeList(id));
        return jm;
    }
}




