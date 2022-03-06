package com.mu;

import com.mu.printer.BinaryTrees;
import com.mu.tree.BST;

public class Main {
    static void test01() {
        Integer data[] = new Integer[] {
                7, 4, 9, 2, 5, 8, 11, 3, 12, 1
        };

        BST<Integer> bst = new BST<>();
        for (int i = 0; i < data.length; i++) {
            bst.add(data[i]);
        }
        bst.add(13);
        BinaryTrees.println(bst);
//        bst.remove(7);
//        BinaryTrees.println(bst);
    }

    public static void main (String[]args){

        Times.test("TimeTest", new Times.Task() {
            @Override
            public void execute() {
                test01();
            }
        });

    }
}