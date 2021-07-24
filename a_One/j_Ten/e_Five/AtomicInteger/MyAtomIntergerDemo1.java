package a_One.j_Ten.e_Five.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomIntergerDemo1 {
    //    public AtomicInteger()：	               初始化一个默认值为0的原子型Integer
    //    public AtomicInteger(int initialValue)： 初始化一个指定值的原子型Integer
    public static void main(String[] args) {
        AtomicInteger ac1 = new AtomicInteger();
        System.out.println(ac1);

        AtomicInteger ac2 = new AtomicInteger(10);
        System.out.println(ac2);
    }
}
