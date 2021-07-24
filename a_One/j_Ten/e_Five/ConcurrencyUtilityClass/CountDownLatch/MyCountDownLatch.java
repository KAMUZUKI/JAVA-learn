package a_One.j_Ten.e_Five.ConcurrencyUtilityClass.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class MyCountDownLatch {
    public static void main(String[] args) {
        //1.创建CountDownLatch的对象，需要传递给四个线程。
        //在底层就定义了一个计数器，此时计数器的值就是3
        CountDownLatch countDownLatch = new CountDownLatch(3);

        //2.创建四个线程对象并开启他们。
        MotherThread motherThread = new MotherThread(countDownLatch);
        motherThread.start();

        ChildThread1 ch1 = new ChildThread1(countDownLatch);
        ch1.setName("小明");
        ChildThread2 ch2 = new ChildThread2(countDownLatch);
        ch2.setName("小红");
        ChildThread3 ch3 = new ChildThread3(countDownLatch);
        ch3.setName("小刚");

        ch1.start();
        ch2.start();
        ch3.start();
    }
}
