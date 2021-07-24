package a_One.j_Ten.d_Four.ThreadPool.ThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo2 {
    public static void main(String[] args) {
        /**
         * �����߳�����Ϊ1 �� ����̳߳�����Ϊ3, ��������������Ϊ1 ,�����̵߳�������ʱ��Ϊ20s
         */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1 , 3 , 20 , TimeUnit.SECONDS ,
                new ArrayBlockingQueue<>(1) , Executors.defaultThreadFactory() , new ThreadPoolExecutor.DiscardPolicy()) ;

        // �ύ5�����񣬶����̳߳������Դ���4�����񣬵�����ʹ��DiscardPolicy�����������Ե�ʱ�򣬿���̨���ᱨ��
        for(int x = 0 ; x < 5 ; x++) {
            threadPoolExecutor.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "---->> ִ��������");
            });
        }
    }
}
