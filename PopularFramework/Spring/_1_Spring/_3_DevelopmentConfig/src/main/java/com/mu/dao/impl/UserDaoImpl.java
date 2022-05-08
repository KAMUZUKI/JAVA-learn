package com.mu.dao.impl;

import com.mu.dao.UserDao;

public class UserDaoImpl implements UserDao {
    private String userName;
    private String password;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void save(){
        System.out.println("UserDaoImpl is running..." + userName + " " + password);
    }
}
