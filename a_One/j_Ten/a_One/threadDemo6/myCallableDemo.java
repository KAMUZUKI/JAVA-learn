package a_One.j_Ten.a_One.threadDemo6;
/* 
优先级相关方法
| 方法名                                  | 说明                                                  |
| --------------------------------------- | ----------------------------------------------------|
| final int getPriority()                 | 返回此线程的优先级                                     |
| final void setPriority(int newPriority) | 更改此线程的优先级线程默认优先级是5；线程优先级的范围是：1-10 | */
import java.util.concurrent.FutureTask;

public class myCallableDemo {
    public static void main(String[] args) {
        myCallable mc = new myCallable();
        FutureTask<String> ft = new FutureTask<>(mc);
        Thread t1 = new Thread(ft);
        t1.setName("飞机");
        t1.setPriority(10);
        //System.out.println(t1.getPriority());//5
        t1.start();

        myCallable mc2 = new myCallable();
        FutureTask<String> ft2 = new FutureTask<>(mc2);
        Thread t2 = new Thread(ft2);
        t2.setName("坦克");
        t2.setPriority(1);
        //System.out.println(t2.getPriority());//5
        t2.start();
    }
}
