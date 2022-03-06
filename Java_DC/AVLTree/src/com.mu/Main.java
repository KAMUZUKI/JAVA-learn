package com.mu;

import com.mu.printer.BinaryTrees;
import com.mu.tree.AVLTree;
import com.mu.tree.BST;
import com.mu.tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void test01() {
        Integer[] data = new Integer[] {
                1,2,3,4,5,6,7,8,9,10,11,12,13
        };

        AVLTree<Integer> avlTree = new AVLTree<>();
        for (Integer i : data) {
            avlTree.add(i);
//            BinaryTrees.println(avlTree);
        }
//        avlTree.remove(4);
//        BinaryTrees.println(avlTree);
//        avlTree.remove(10);
        BinaryTrees.println(avlTree);
    }

    public static void test02(){
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < 10_0000; i++) {
            data.add((int)(Math.random()*100000));
        }
        BST<Integer> bst = new BST<>();
        for (int i = 0; i < data.size(); i++) {
            bst.add(data.get(i));
        }
        for (int i = 0; i < data.size(); i++) {
            bst.contains(data.get(i));
        }
        for (int i = 0; i < data.size(); i++) {
            bst.remove(data.get(i));
        }
    }

    public static void test03(){
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < 10_0000; i++) {
            data.add((int)(Math.random()*100000));
        }
        AVLTree<Integer> avlTree = new AVLTree<>();
        for (int i = 0; i < data.size(); i++) {
            avlTree.add(data.get(i));
        }
        System.out.println(avlTree.getSize());
        for (int i = 0; i < data.size(); i++) {
            avlTree.contains(data.get(i));
        }
        for (int i = 0; i < data.size(); i++) {
            avlTree.remove(data.get(i));
        }

    }

    public static void main (String[]args){

        Times.test("TimeTest", new Times.Task() {
            @Override
            public void execute() {
                test01();
//                test02();
            }
        });

        Times.test("TimeTest", new Times.Task() {
            @Override
            public void execute() {
//                test03();
            }
        });

    }
}