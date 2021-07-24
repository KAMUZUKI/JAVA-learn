package a_One.j_Ten.d_Four.ThreadPool.ThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo3 {
    public static void main(String[] args) {
        /**
         * �����߳�����Ϊ1 �� ����̳߳�����Ϊ3, ��������������Ϊ1 ,�����̵߳�������ʱ��Ϊ20s
         */
        ThreadPoolExecutor threadPoolExecutor;
        threadPoolExecutor = new ThreadPoolExecutor(1 , 3 , 20 , TimeUnit.SECONDS ,
                new ArrayBlockingQueue<>(1) , 
                Executors.defaultThreadFactory() , 
                new ThreadPoolExecutor.DiscardOldestPolicy());
        // �ύ5������
        for(int x = 0 ; x < 5 ; x++) {
            // ����һ����������ָ��ָ����ǰִ�е�����;���������Ҫ��final����
            final int y = x ;
            threadPoolExecutor.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "---->> ִ��������" + y);
            });     
        }
    }
}
