package com.mu.service;

import com.mu.pojo.Dept;

import java.util.List;

public interface DeptService {
    boolean add(Dept dept);

    int delete(int id);

    List<Dept> queryList();
}

