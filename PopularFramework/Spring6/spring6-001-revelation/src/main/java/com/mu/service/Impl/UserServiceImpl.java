package com.mu.service.Impl;

import com.mu.dao.Impl.UserDaoImpl;
import com.mu.dao.UserDao;
import com.mu.service.UserService;

/**
 * @author : MUZUKI
 * @date : 2023-02-21 19:55
 **/

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

//    private UserDao userDao;

    @Override
    public void deleteUserById() {
        userDao.deleteUserById();
        System.out.println("UserServiceImpl");
    }
}
