package com.mu;
import com.mu.SearchBinaryTree.Visitor;
import com.mu.printer.BinaryTrees;

import java.util.Comparator;

public class Main {
    private static class PersonCompartor implements Comparator<Person>{
        public int compare(Person e1,Person e2){
            return e1.getAge() - e2.getAge();
        }
    }

    public static void test01(){
        System.out.println("===============================   Test1   ==============================");
        SearchBinaryTree<Person> sbt1 = new SearchBinaryTree<>(new PersonCompartor());
        Integer data[] = new Integer[]{
                7,4,9,2,5,8,11,3,12,1
        };
        for (int i = 0; i < data.length; i++) {
            sbt1.add(new Person(data[i]));
        }
        BinaryTrees.println(sbt1);

    }

    public static void test02(){
        System.out.println("===============================   Test2   ==============================");
        SearchBinaryTree<Person> sbt2 = new SearchBinaryTree<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        Integer data[] = new Integer[]{
                7,4,9,2,5,8,11,3,12,1
        };
        for (int i = 0; i < data.length; i++) {
            sbt2.add(new Person(data[i]));
        }
        BinaryTrees.println(sbt2);

    }

    public static void test03(){
        System.out.println("===============================   Test3   ==============================");
        SearchBinaryTree<Integer> sbt3 = new SearchBinaryTree<>();
        Integer data[] = new Integer[]{
                7,4,9,2,5,8,11,3,12,1
        };
        for (int i = 0; i < data.length; i++) {
            sbt3.add(data[i]);
        }
        BinaryTrees.println(sbt3);
        sbt3.levelOrder(new Visitor<Integer>() {
            @Override
            public boolean visit(Integer element) {
                System.out.println("element.value = " + element);
                return element == 11? true:false;
            }
        });
    }

    public static void test04() {
        System.out.println("===============================   Test4   ==============================");
        SearchBinaryTree<Person> sbt4 = new SearchBinaryTree<>();
        Integer data[] = new Integer[]{
                7, 4, 9, 2, 5, 8, 11, 3, 12, 1
        };
        for (int i = 0; i < data.length; i++) {
            sbt4.add(new Person(data[i]));
            BinaryTrees.println(sbt4);
            //sbt2.preorderTraversal();
            //sbt2.inorderTraversal();
            //sbt2.postTraversal();
            sbt4.levelOrder(new Visitor<Person>() {
                @Override
                public boolean visit(Person p) {
                    System.out.println("Person.age = " + p.getAge());
                    return p.getAge() == 9 ? true : false;
                }
            });
        }
    }

    public static void test05(){
        System.out.println("===============================   Test5   ==============================");
        SearchBinaryTree<Integer> sbt5 = new SearchBinaryTree<>();
        Integer data[] = new Integer[]{
                7, 4, 9, 2, 5, 8, 11, 3, 12, 1
        };
        for (int i = 0; i < data.length; i++) {
            sbt5.add(data[i]);
        }
        sbt5.preorder(new Visitor<Integer>() {
            @Override
            public boolean visit(Integer element) {
                System.out.print(element + "  ");
                return element == 9?true:false;
            }
        });
        System.out.println();

        sbt5.preorder(new Visitor<Integer>() {
            @Override
            public boolean visit(Integer element) {
                System.out.print(element + "  ");
                return false;
            }
        });
        System.out.println();
        System.out.println("===================");

        sbt5.inorder(new Visitor<Integer>() {
            @Override
            public boolean visit(Integer element) {
                System.out.print(element + "  ");
                return element == 9?true:false;
            }
        });
        System.out.println();
        sbt5.inorder(new Visitor<Integer>() {
            @Override
            public boolean visit(Integer element) {
                System.out.print(element + "  ");
                return false;
            }
        });
        System.out.println();
        System.out.println("===================");

        sbt5.postorder(new Visitor<Integer>() {
            @Override
            public boolean visit(Integer element) {
                System.out.print(element + "  ");
                return element == 9?true:false;
            }
        });
        System.out.println();
        sbt5.postorder(new Visitor<Integer>() {
            @Override
            public boolean visit(Integer element) {
                System.out.print(element + "  ");
                return false;
            }
        });
        System.out.println();
        System.out.println("===================");

        sbt5.levelOrder(new Visitor<Integer>() {
            @Override
            public boolean visit(Integer element) {
                System.out.print(element + "  ");
                return element == 9?true:false;
            }
        });
        System.out.println();
        sbt5.levelOrder(new Visitor<Integer>() {
            @Override
            public boolean visit(Integer element) {
                System.out.print(element + "  ");
                return false;
            }
        });
        System.out.println();
        System.out.println("===================");
    }

    public static void test06(){
        System.out.println("===============================   Test6   ==============================");
        SearchBinaryTree<Person> sbt6 = new SearchBinaryTree<>(new PersonCompartor());
        Integer data[] = new Integer[]{
                7,4,9,2,5,8,11,3,12,1
        };
        for (int i = 0; i < data.length; i++) {
            sbt6.add(new Person(data[i]));
        }
        BinaryTrees.println(sbt6);
        System.out.println(sbt6.height());
        System.out.println(sbt6.height2());
    }

    public static void test07(){
        System.out.println("===============================   Test7   ==============================");
        SearchBinaryTree<Person> sbt7 = new SearchBinaryTree<>(new PersonCompartor());
        Integer data[] = new Integer[]{
                7,4,9,2,5,8,11
        };
        for (int i = 0; i < data.length; i++) {
            sbt7.add(new Person(data[i]));
        }
        BinaryTrees.println(sbt7);
        System.out.println(sbt7.isCompelte());
    }

    public static void test08(){
        System.out.println("===============================   Test8   ==============================");
        SearchBinaryTree<Integer> sbt8 = new SearchBinaryTree<>();
        Integer data[] = new Integer[]{
                8,4,2,1,3,6,5,7,13,10,9,12,11
        };
        for (int i = 0; i < data.length; i++) {
            sbt8.add(data[i]);
        }
        BinaryTrees.println(sbt8);
        System.out.println(sbt8.predecessor(7));
        System.out.println(sbt8.predecessor(13));
    }

    public static void test09(){
        System.out.println("===============================   Test9   ==============================");
        SearchBinaryTree<Integer> sbt9 = new SearchBinaryTree<>();
        Integer data[] = new Integer[]{
                8,4,2,1,3,6,5,7,13,10,9,12,11
        };
        for (int i = 0; i < data.length; i++) {
            sbt9.add(data[i]);
        }
        BinaryTrees.println(sbt9);
        sbt9.remove(13);
        BinaryTrees.println(sbt9);
        sbt9.remove(4);
        BinaryTrees.println(sbt9);
    }

    public static void main (String[]args){

        Times.test("TimeTest", new Times.Task() {
            @Override
            public void execute() {
                test01();
                test02();
                test03();
                test04();
                test05();
                test06();
                test07();
                test08();
                test09();
            }
        });

    }
}







