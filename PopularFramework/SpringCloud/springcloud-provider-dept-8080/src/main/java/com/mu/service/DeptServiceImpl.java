package com.mu.service;

import com.mu.dao.DeptDao;
import com.mu.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.add(dept);
    }

    @Override
    public int delete(int id) {
        return deptDao.delete(id);
    }

    @Override
    public List<Dept> queryList() {
        return deptDao.queryList();
    }
}
