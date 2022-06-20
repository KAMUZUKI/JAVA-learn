package com.mu.controller;

import com.mu.pojo.Dept;
import com.mu.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @PostMapping("/dept/add")
    public boolean add(@RequestBody Dept dept) {  //接受请求为空 参数前添加 @RequestBody 注解
        return deptService.add(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") int id) {
        return deptService.get(id);
    }

    @GetMapping("/dept/queryList")
    public List<Dept> queryList() {
        return deptService.queryList();
    }
}
