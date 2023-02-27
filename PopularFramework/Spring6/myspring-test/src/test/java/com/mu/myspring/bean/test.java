package com.mu.myspring.bean;

import org.junit.Test;
import org.myspringframework.ApplicationContext;
import org.myspringframework.ClassPathXmlApplicationContext;

/**
 * @author : MUZUKI
 * @date : 2023-02-22 19:53
 **/

public class test {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
        Object vip = applicationContext.getBean("vip");
        System.out.println(vip);

        OrderService orderService = (OrderService) applicationContext.getBean("orderService");
        orderService.generate();
    }
}
