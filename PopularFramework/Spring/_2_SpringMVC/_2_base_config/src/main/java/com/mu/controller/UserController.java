package com.mu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/User")
public class UserController {
    @RequestMapping("/save")
    public String save(){
        System.out.println("user mvc controller is running...");
        return "success.jsp";
    }

    @RequestMapping("/quick12")
    @ResponseBody
    public void save12(String username,int age){
        System.out.println("username = " + username);
        System.out.println("age = " + age);
    }
}
