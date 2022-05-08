package com.mu.service.impl;

import com.mu.dao.BookDao;
import com.mu.dao.UserDao;
import com.mu.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    private BookDao bookDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save(){
        userDao.save();
        bookDao.save();
        System.out.println("UserServiceImpl is running...");
    }
}
