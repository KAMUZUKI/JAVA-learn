package com.mu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @author MUZUKI
 */
@RestController
public class OrderController {
    @GetMapping("doOrder")
    public String doOrder(){
        Logger.getLogger("有用户来下单了！");
        return "下单成功2222";
    }
}
