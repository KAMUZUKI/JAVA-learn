package com.mu.service.impl;

import com.mu.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void say() {
        System.out.println("UserServiceImpl is running...");
    }
}
