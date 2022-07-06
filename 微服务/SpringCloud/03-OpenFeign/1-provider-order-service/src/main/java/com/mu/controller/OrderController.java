package com.mu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MUZUKI
 */
@RestController
public class OrderController {
    @GetMapping("doOrder")
    public String doOrder(){
        System.out.println("有用户来下单了！");
        return "下单成功";
    }
}
