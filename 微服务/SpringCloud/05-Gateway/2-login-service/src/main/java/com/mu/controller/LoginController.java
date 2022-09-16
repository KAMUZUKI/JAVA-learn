package com.mu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author MUZUKI
 */
@RestController
public class LoginController {

    @GetMapping("doLogin")
    public String doLogin(String username,String password) {
        System.out.println(username);
        System.out.println(password);
        String token = UUID.randomUUID().toString();
        return token;
    }
}
