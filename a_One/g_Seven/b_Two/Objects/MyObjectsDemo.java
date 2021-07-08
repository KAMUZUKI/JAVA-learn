package a_One.g_Seven.b_Two.Objects;

import java.util.Objects;

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class MyObjectsDemo {
    public static void main(String[] args) {
        //        public static String toString(对象): 返回参数中对象的字符串表示形式。
        //        Student s = new Student("小罗同学",50);
        //        String result = Objects.toString(s);
        //        System.out.println(result);
        //        System.out.println(s);
  
        //        public static String toString(对象, 默认字符串): 返回对象的字符串表示形式。如果对象为空,那么返回第二个参数.
                //Student s = new Student("小花同学",23);
        //        Student s = null;
        //        String result = Objects.toString(s, "随便写一个");
        //        System.out.println(result);
        
        //        public static Boolean isNull(对象): 判断对象是否为空
                //Student s = null;
        //        Student s = new Student();
        //        boolean result = Objects.isNull(s);
        //        System.out.println(result);
  
        //        public static Boolean nonNull(对象): 判断对象是否不为空
        //Student s = new Student();
        Student s = null;
        boolean result = Objects.nonNull(s);
        System.out.println(result);
    }
}
