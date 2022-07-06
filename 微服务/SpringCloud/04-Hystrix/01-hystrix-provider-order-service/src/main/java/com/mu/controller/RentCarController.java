package com.mu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MUZUKI
 */

@RestController
public class RentCarController {

    /**
     * 租车服务下单接口
     * @return java.lang.String
     */
    @GetMapping("rent")
    public String rent() {
        return "租车成功";
    }
}
