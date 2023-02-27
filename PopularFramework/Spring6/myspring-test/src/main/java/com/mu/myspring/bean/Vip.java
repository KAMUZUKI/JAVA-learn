package com.mu.myspring.bean;

/**
 * @author : MUZUKI
 * @date : 2023-02-22 19:52
 **/

public class Vip {
    private String name;
    private int age;
    private double height;

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
