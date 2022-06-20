package com.mu.service;

import com.mu.pojo.Dept;

import java.util.List;

public interface DeptService {
    boolean add(Dept dept);

    Dept get(int id);

    List<Dept> queryList();
}

