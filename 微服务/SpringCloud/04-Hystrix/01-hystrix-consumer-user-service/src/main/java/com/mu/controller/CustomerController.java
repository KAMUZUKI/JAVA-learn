package com.mu.controller;

import com.mu.feign.CustomerRentFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author MUZUKI
 */

@RestController
public class CustomerController {
    @Resource
    private CustomerRentFeign customerRentFeign;

    @GetMapping("customerRent")
    public String customerRent(){
        System.out.println("客户来租车了");
        return customerRentFeign.rent();
    }
}
