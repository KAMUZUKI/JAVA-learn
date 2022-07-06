package com.mu.controller;

import com.mu.domain.Order;
import com.mu.feign.UserOrderFeign;
import com.mu.model.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
public class TestController {
    @Autowired
    private UserOrderFeign userOrderFeign;

    @RequestMapping("testFeignParam")
    public String testFeignParam() {
        // 测试一个参数
        BaseResult result1 = userOrderFeign.oneParam("zhangsan");
        System.out.println(result1);
        System.out.println("--------------------------------------------------");
        // 测试多个参数
        BaseResult result2 = userOrderFeign.twoParam("zhangsan", 666);
        System.out.println(result2);
        System.out.println("--------------------------------------------------");
        // 测试一个对象
        Order order = new Order("111", "牛排", "一份牛排 256g", new Date(), "159357");
        BaseResult result3 = userOrderFeign.objectParam(order);
        System.out.println(result3);
        System.out.println("--------------------------------------------------");
        // 测试 url 传参
        BaseResult result4 = userOrderFeign.testUrlParam(999);
        System.out.println(result4);
        System.out.println("--------------------------------------------------");
        // 测试一个对象 一个参数
        BaseResult result5 = userOrderFeign.oneObjectOneParam(order,"zhangsan");
        System.out.println(result5);
        System.out.println("--------------------------------------------------");
        return "ok";
    }
}
