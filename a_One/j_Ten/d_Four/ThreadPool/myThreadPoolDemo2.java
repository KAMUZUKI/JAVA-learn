package a_One.j_Ten.d_Four.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/* 
### 线程池-Executors创建指定上限的线程池
使用Executors中所提供的静态方法来创建线程池

?	static ExecutorService newFixedThreadPool(int nThreads) : 创建一个指定最多线程数量的线程池 */
public class myThreadPoolDemo2 {
    public static void main(String[] args) {

        //参数不是初始值而是最大值
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor pool = (ThreadPoolExecutor)executorService;

        System.out.println(pool.getPoolSize());

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName() + "在执行了");
        });

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName() + "在执行了");
        });

        System.out.println(pool.getPoolSize());

        executorService.shutdown();
    }
}
