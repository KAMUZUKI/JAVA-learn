package com.mu;

import com.mu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class UserApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a animal name:>");
        String animalName = sc.next();
        System.out.println("please input what sounds do animals make:>");
        String animalSpeak = sc.next();

        Animal animal = new Animal(animalName,animalSpeak);
        animal.speak();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.say();
        Animal dog = (Animal) ctx.getBean("animalSay1");
        dog.speak();
        Animal cat = (Animal) ctx.getBean("animalSay2");
        cat.speak();
    }
}
