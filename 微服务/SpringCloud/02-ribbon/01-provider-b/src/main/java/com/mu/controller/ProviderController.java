package com.mu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MUZUKI
 */

@RestController
public class ProviderController {
    @GetMapping("hello")
    public String hello(){
        return "我是提供者bbbb的接口";
    }
}
