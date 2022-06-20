package com.mu.controller;

import com.mu.pojo.Dept;
import com.mu.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @PostMapping("/dept/add")
    public boolean add(Dept dept) {
        return deptService.add(dept);
    }

    @GetMapping("/dept/delete")
    public int delete(int id) {
        return deptService.delete(id);
    }

    @PostMapping("/dept/queryList")
    public List<Dept> queryList() {
        return deptService.queryList();
    }
}
