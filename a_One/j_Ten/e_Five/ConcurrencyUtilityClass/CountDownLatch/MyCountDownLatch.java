package a_One.j_Ten.e_Five.ConcurrencyUtilityClass.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class MyCountDownLatch {
    public static void main(String[] args) {
        //1.����CountDownLatch�Ķ�����Ҫ���ݸ��ĸ��̡߳�
        //�ڵײ�Ͷ�����һ������������ʱ��������ֵ����3
        CountDownLatch countDownLatch = new CountDownLatch(3);

        //2.�����ĸ��̶߳��󲢿������ǡ�
        MotherThread motherThread = new MotherThread(countDownLatch);
        motherThread.start();

        ChildThread1 ch1 = new ChildThread1(countDownLatch);
        ch1.setName("С��");
        ChildThread2 ch2 = new ChildThread2(countDownLatch);
        ch2.setName("С��");
        ChildThread3 ch3 = new ChildThread3(countDownLatch);
        ch3.setName("С��");

        ch1.start();
        ch2.start();
        ch3.start();
    }
}
