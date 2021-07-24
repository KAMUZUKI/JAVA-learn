package a_One.j_Ten.e_Five.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomIntergerDemo2 {
    public static void main(String[] args) {
        //    int get():   		 		获取值
        //    int getAndIncrement():     以原子方式将当前值加1，注意，这里返回的是自增前的值。
        //    int incrementAndGet():     以原子方式将当前值加1，注意，这里返回的是自增后的值。
        //    int addAndGet(int data):	 以原子方式将参数与对象中的值相加，并返回结果。
        //    int getAndSet(int value):  以原子方式设置为newValue的值，并返回旧值。

        AtomicInteger ac1 = new AtomicInteger();
        System.out.println(ac1.get());
        
        AtomicInteger ac2 = new AtomicInteger(10);
        System.out.println(ac2.getAndIncrement());
        
        AtomicInteger ac3 = new AtomicInteger(10);
        System.out.println(ac3.incrementAndGet());
        
        AtomicInteger ac4 = new AtomicInteger(10);
        System.out.println(ac4.addAndGet(20));
        
        AtomicInteger ac5 = new AtomicInteger(10);
        System.out.println(ac5.getAndSet(20));
        System.out.println(ac5);


    }
}
