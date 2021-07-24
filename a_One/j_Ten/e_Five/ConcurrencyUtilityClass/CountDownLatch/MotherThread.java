package a_One.j_Ten.e_Five.ConcurrencyUtilityClass.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class MotherThread extends Thread{
    private CountDownLatch countDownLatch;
    public MotherThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run(){
        //1.�ȴ�
        try {
            //�����������0��ʱ�򣬻��Զ���������ȴ����̡߳�
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //2.��ʰ���
        System.out.println("��������ʰ���");
    }
    
}
