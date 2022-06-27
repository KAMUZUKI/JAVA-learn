package com.mu.controller;

import com.mu.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String Rest_URL_PREFIX = "http://localhost:8081";

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(Rest_URL_PREFIX + "/dept/add",dept,Boolean.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") int id) {
        return restTemplate.getForObject(Rest_URL_PREFIX + "/dept/get/" +id,Dept.class);
    }

    @RequestMapping("/consumer/dept/queryList")
    public List<Dept> queryList() {
        return restTemplate.getForObject(Rest_URL_PREFIX + "/dept/queryList",List.class);
    }
}
