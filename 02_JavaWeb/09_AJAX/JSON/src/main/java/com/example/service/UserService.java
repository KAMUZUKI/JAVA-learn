package com.example.service;

import com.example.bean.DUser;

import java.util.List;

public interface UserService {
    public abstract List<DUser> selectLike(String username);
}
