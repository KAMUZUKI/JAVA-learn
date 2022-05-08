package com.mu.dao.impl;

import com.mu.dao.UserDao;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDaoImpl implements UserDao {
    public void save(){
        System.out.println("UserServiceImpl is running...");
    };
}
