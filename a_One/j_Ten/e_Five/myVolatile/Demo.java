package a_One.j_Ten.e_Five.myVolatile;
/* 
### volatile���

**���ϰ������ֵ����� :**
?	��A�߳��޸��˹�������ʱ��B�߳�û�м�ʱ��ȡ�����µ�ֵ���������ʹ��ԭ�ȵ�ֵ���ͻ�������� 
?	1�����ڴ���Ψһ�ģ�ÿһ���̶߳����Լ����߳�ջ��
?	2 ��ÿһ���߳���ʹ�ö����������ʱ�򣬶����ȿ���һ�ݵ������ĸ����С�
?	3 �����߳��У�ÿһ��ʹ���Ǵӱ����ĸ����л�ȡ�ġ�
**Volatile�ؼ��� :** ǿ���߳�ÿ����ʹ�õ�ʱ�򣬶��ῴһ�¹����������µ�ֵ */
public class Demo {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();

        t1.setName("С·ͬѧ");
        t1.start();
        t2.setName("С��ͬѧ");
        t2.start();
    }
}

