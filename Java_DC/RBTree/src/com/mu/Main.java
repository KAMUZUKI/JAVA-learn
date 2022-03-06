package com.mu;

import com.mu.printer.BinaryTrees;

import com.mu.tree.OrderArray;
import com.mu.tree.RBTree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void test01() {
        Integer[] data = new Integer[] {
//          71, 11, 67, 28, 78, 15, 61, 84, 53, 36, 4, 88
        };

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <65000; i++) {
            list.add(i);
        }

        RBTree<Integer> rbTree = new RBTree<>();
        for (int i = 0; i <65000; i++) {
            rbTree.add(list.get(i));
        }

        for (int i = 1; i <65000; i++) {
            rbTree.remove(list.get(i));
        }

    }

    public static void test02(){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <65000; i++) {
            list.add(i);
        }

        OrderArray orderArray = new OrderArray(65000);
        for (int i = 0; i <65000; i++) {
            orderArray.insert(i);
        }
        for (int i = 0; i <65000; i++) {
            orderArray.find(i);
        }
        for (int i = 0; i <65000; i++) {
            orderArray.delete(i);
        }


    }
    public static void main (String[]args){

        Times.test("TimeTest1", new Times.Task() {
            @Override
            public void execute() {
                test01();
            }
        });

        Times.test("TimeTest2", new Times.Task() {
            @Override
            public void execute() {
                test02();
            }
        });
    }
}