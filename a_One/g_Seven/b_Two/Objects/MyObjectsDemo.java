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
        //        public static String toString(����): ���ز����ж�����ַ�����ʾ��ʽ��
        //        Student s = new Student("С��ͬѧ",50);
        //        String result = Objects.toString(s);
        //        System.out.println(result);
        //        System.out.println(s);
  
        //        public static String toString(����, Ĭ���ַ���): ���ض�����ַ�����ʾ��ʽ���������Ϊ��,��ô���صڶ�������.
                //Student s = new Student("С��ͬѧ",23);
        //        Student s = null;
        //        String result = Objects.toString(s, "���дһ��");
        //        System.out.println(result);
        
        //        public static Boolean isNull(����): �ж϶����Ƿ�Ϊ��
                //Student s = null;
        //        Student s = new Student();
        //        boolean result = Objects.isNull(s);
        //        System.out.println(result);
  
        //        public static Boolean nonNull(����): �ж϶����Ƿ�Ϊ��
        //Student s = new Student();
        Student s = null;
        boolean result = Objects.nonNull(s);
        System.out.println(result);
    }
}
