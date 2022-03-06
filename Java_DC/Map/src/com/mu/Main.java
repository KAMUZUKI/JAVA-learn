package com.mu;

import com.mu.file.FileInfo;
import com.mu.file.Files;
import com.mu.map.Map;
import com.mu.map.TreeMap;

public class Main {

    static void test01(){
        Map<String,Integer> map = new TreeMap<>();
        map.put("zhangsan",23);
        map.put("lisi",24);
        map.put("wangwu",25);

        map.traversal(new Map.Visitor<String, Integer>() {
            @Override
            public boolean visit(String key, Integer value) {
                System.out.println(key + "_" + value);
                return false;
            }
        });
    }

    static void test02() {
        FileInfo fileInfo = Files.read("C:\\Users\\MUZUKI\\Desktop\\src\\java.base\\java\\util",
                new String[]{"java"});

        System.out.println("文件数量：" + fileInfo.getFiles());
        System.out.println("代码行数：" + fileInfo.getLines());
        String[] words = fileInfo.words();
        System.out.println("单词数量：" + words.length);

        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < words.length; i++) {
            Integer count = map.get(words[i]);
            count = (count == null) ? 1 : (count + 1);
            map.put(words[i], count);
        }

        map.traversal(new Map.Visitor<String, Integer>() {
            public boolean visit(String key, Integer value) {
                System.out.println(key + "_" + value);
                return false;
            }
        });
    }
    public static void main(String[] args) {
        Times.test("Test01", new Times.Task() {
            @Override
            public void execute() {
//                test01();
                test02();
            }
        });
    }
}
