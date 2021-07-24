package a_One.j_Ten.d_Four.ThreadPool.ThreadPoolExecutor;
/* 
### �̳߳�-��Ĭ������ܾ�����
RejectedExecutionHandler��jdk�ṩ��һ������ܾ����Խӿڣ����������4�����ࡣ

ThreadPoolExecutor.AbortPolicy: 		    ���������׳�RejectedExecutionException�쳣����Ĭ�ϵĲ��ԡ�
ThreadPoolExecutor.DiscardPolicy�� 		   �������񣬵��ǲ��׳��쳣 ���ǲ��Ƽ���������
ThreadPoolExecutor.DiscardOldestPolicy��    ���������еȴ���õ����� Ȼ��ѵ�ǰ�����������С�
ThreadPoolExecutor.CallerRunsPolicy:        ���������run()�����ƹ��̳߳�ֱ��ִ�С� */

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo1 {
    public static void main(String[] args) {

        /**
         * �����߳�����Ϊ1 �� ����̳߳�����Ϊ3, ��������������Ϊ1 ,�����̵߳�������ʱ��Ϊ20s
         */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1 , 3 , 20 , TimeUnit.SECONDS ,
                new ArrayBlockingQueue<>(1) , 
                Executors.defaultThreadFactory() , 
                new ThreadPoolExecutor.AbortPolicy()) ;

        // �ύ5�����񣬶����̳߳������Դ���4�����񣬵�����ʹ��AbortPolicy�����������Ե�ʱ�򣬾ͻ��׳��쳣
        for(int x = 0 ; x < 5 ; x++) {
            threadPoolExecutor.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "---->> ִ��������");
            });
        }
    }
}
