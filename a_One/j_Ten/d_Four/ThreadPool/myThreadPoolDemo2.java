package a_One.j_Ten.d_Four.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/* 
### �̳߳�-Executors����ָ�����޵��̳߳�
ʹ��Executors�����ṩ�ľ�̬�����������̳߳�

?	static ExecutorService newFixedThreadPool(int nThreads) : ����һ��ָ������߳��������̳߳� */
public class myThreadPoolDemo2 {
    public static void main(String[] args) {

        //�������ǳ�ʼֵ�������ֵ
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor pool = (ThreadPoolExecutor)executorService;

        System.out.println(pool.getPoolSize());

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName() + "��ִ����");
        });

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName() + "��ִ����");
        });

        System.out.println(pool.getPoolSize());

        executorService.shutdown();
    }
}
