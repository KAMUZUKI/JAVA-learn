package com.mu.proxy.jdk;

public class Advice {
    public void after(){
        System.out.println("after...");
    }

    public void before(){
        System.out.println("before...");
    }
}
