package a_One.j_Ten.e_Five.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomIntergerDemo2 {
    public static void main(String[] args) {
        //    int get():   		 		��ȡֵ
        //    int getAndIncrement():     ��ԭ�ӷ�ʽ����ǰֵ��1��ע�⣬���ﷵ�ص�������ǰ��ֵ��
        //    int incrementAndGet():     ��ԭ�ӷ�ʽ����ǰֵ��1��ע�⣬���ﷵ�ص����������ֵ��
        //    int addAndGet(int data):	 ��ԭ�ӷ�ʽ������������е�ֵ��ӣ������ؽ����
        //    int getAndSet(int value):  ��ԭ�ӷ�ʽ����ΪnewValue��ֵ�������ؾ�ֵ��

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
