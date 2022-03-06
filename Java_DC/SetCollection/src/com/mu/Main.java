package com.mu;

import com.mu.file.FileInfo;
import com.mu.file.Files;
import com.mu.set.ArrayListSet;
import com.mu.set.ListSet;
import com.mu.set.Set;
import com.mu.set.TreeSet;

public class Main {
    static void test01(){
        Set<Integer> arrayListSet = new ArrayListSet<>();
        arrayListSet.add(10);

        arrayListSet.traversal(new Set.Visitor<Integer>(){
            @Override
            public boolean visit(Integer element) {
                System.out.println(element);
                return false;
            }
        });
    }

    static void test02(){
        Set<Integer> listSet = new ListSet<>();
        listSet.add(10);
        listSet.add(11);
        listSet.add(12);
        listSet.add(12);
        listSet.add(11);
        listSet.traversal(new Set.Visitor<Integer>(){
            @Override
            public boolean visit(Integer element) {
                System.out.println(element);
                return false;
            }
        });
    }

    static void test03(){
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.traversal(new Set.Visitor<Integer>(){
            @Override
            public boolean visit(Integer element) {
                System.out.println(element);
                return false;
            }
        });
    }
    static void test(Set<String> set, String[] words){
        System.out.println("word.lenth = " + words.length);

        for (int i = 0; i < words.length; i++) {
            set.add(words[i]);
        }
        System.out.println("set.size = " + set.size());
        for (int i = 0; i < words.length; i++) {
            set.contains(words[i]);
        }
        for (int i = 0; i < words.length; i++) {
            set.remove(words[i]);
        }
    }
    public static void main(String[] args) {
        FileInfo fileInfo = Files.read("C:\\Users\\MUZUKI\\Desktop\\src\\java.base\\java\\util",
                new String[]{"java"});

        System.out.println("文件数量：" + fileInfo.getFiles());
        System.out.println("代码行数：" + fileInfo.getLines());
        String[] words = fileInfo.words();

        System.out.println("单词数量：" + words.length);

        Times.test("arrayListSet-Test", new Times.Task() {
            @Override
            public void execute() {
                test(new ArrayListSet<>(), words);
            }
        });

        Times.test("listSet-Test", new Times.Task() {
            @Override
            public void execute() {
                test(new ListSet<>(), words);
            }
        });
        Times.test("treeSet-Test", new Times.Task() {
            @Override
            public void execute() {
                test(new TreeSet<>(), words);
            }
        });
    }
}
