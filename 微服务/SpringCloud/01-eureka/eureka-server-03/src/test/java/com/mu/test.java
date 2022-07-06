package com.mu;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class test {
    @Test
    public void test01(){
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.forEach(System.out::println);
    }
}
