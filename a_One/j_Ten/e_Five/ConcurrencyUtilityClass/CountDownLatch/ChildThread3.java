package a_One.j_Ten.e_Five.ConcurrencyUtilityClass.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class ChildThread3 extends Thread{
    private CountDownLatch countDownLatch;
    public ChildThread3(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        //1.�Խ���
        for (int i = 1; i <= 20; i++) {
            System.out.println(getName() + "�ڳԵ�" + i + "������");
        }
        //2.����˵һ��
        //ÿһ��countDown������ʱ�򣬾��ü�����-1
        countDownLatch.countDown();
    }
}
