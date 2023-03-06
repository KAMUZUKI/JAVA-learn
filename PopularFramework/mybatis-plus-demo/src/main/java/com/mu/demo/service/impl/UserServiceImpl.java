package com.mu.demo.service.impl;

import com.mu.demo.service.UserService;
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

    private JsonModel jm = new JsonModel();

    @Override
    @RequestMapping(value = "/getAllUser")
    public JsonModel getAllUser() {
        jm.setData(userDao.getAllUser());
        return jm;
    }

    @Override
    @RequestMapping(value = "/getLikeList")
    public JsonModel getLikeList(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("userId"));
        jm.setData(userDao.getLikeList(id));
        return jm;
    }
}




