package a_One.j_Ten.e_Five.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomIntergerDemo1 {
    //    public AtomicInteger()��	               ��ʼ��һ��Ĭ��ֵΪ0��ԭ����Integer
    //    public AtomicInteger(int initialValue)�� ��ʼ��һ��ָ��ֵ��ԭ����Integer
    public static void main(String[] args) {
        AtomicInteger ac1 = new AtomicInteger();
        System.out.println(ac1);

        AtomicInteger ac2 = new AtomicInteger(10);
        System.out.println(ac2);
    }
}
