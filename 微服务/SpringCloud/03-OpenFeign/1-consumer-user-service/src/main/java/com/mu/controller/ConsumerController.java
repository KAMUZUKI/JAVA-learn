package com.mu.controller;

import com.mu.feign.UserOrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @author MUZUKI
 */
@RestController
public class ConsumerController {

    @Autowired
    private UserOrderFeign userOrderFeign;

    /**
     * 用户远程调用下单的接口
     *
     * @return java.lang.String
     */
    @GetMapping("userDoOrder")
    public String userDoOrder(){
        String result = userOrderFeign.doOrder();
        Logger.getLogger(result);
        return result;
    }
}
