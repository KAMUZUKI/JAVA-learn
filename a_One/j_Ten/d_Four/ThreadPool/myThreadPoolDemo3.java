package a_One.j_Ten.d_Four.ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import a_One.j_Ten.a_One.threadDemo5.myRunnable;

/* ### 线程池-ThreadPoolExecutor
创建线程池对象 :

ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
(核心线程数量,最大线程数量,空闲线程最大存活时间,任务队列,创建线程工厂,任务的拒绝策略); */

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
    
corePoolSize：   核心线程的最大值，不能小于0
maximumPoolSize：最大线程数，不能小于等于0，maximumPoolSize >= corePoolSize
keepAliveTime：  空闲线程最大存活时间,不能小于0
unit：           时间单位
workQueue：      任务队列，不能为null
threadFactory：  创建线程工厂,不能为null      
handler：        任务的拒绝策略,不能为null   */