package a_One.j_Ten.d_Four.ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import a_One.j_Ten.a_One.threadDemo5.myRunnable;

/* ### �̳߳�-ThreadPoolExecutor
�����̳߳ض��� :

ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
(�����߳�����,����߳�����,�����߳������ʱ��,�������,�����̹߳���,����ľܾ�����); */

public class myThreadPoolDemo3 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
            2, 
            5, 
            2, 
            TimeUnit.SECONDS, 
            new ArrayBlockingQueue<>(10), 
            Executors.defaultThreadFactory(), 
            new ThreadPoolExecutor.AbortPolicy());

        pool.submit(new myRunnable());
        pool.submit(new myRunnable());

        pool.shutdown();
    }
}




/* public ThreadPoolExecutor(int corePoolSize,
                              int maximumPoolSize,
                              long keepAliveTime,
                              TimeUnit unit,
                              BlockingQueue<Runnable> workQueue,
                              ThreadFactory threadFactory,
                              RejectedExecutionHandler handler)
    
corePoolSize��   �����̵߳����ֵ������С��0
maximumPoolSize������߳���������С�ڵ���0��maximumPoolSize >= corePoolSize
keepAliveTime��  �����߳������ʱ��,����С��0
unit��           ʱ�䵥λ
workQueue��      ������У�����Ϊnull
threadFactory��  �����̹߳���,����Ϊnull      
handler��        ����ľܾ�����,����Ϊnull   */