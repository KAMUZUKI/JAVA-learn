package a_One.j_Ten.d_Four.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* 
### 线程池-Executors默认线程池

概述 : JDK对线程池也进行了相关的实现，在真实企业开发中我们也很少去自定义线程池，而是使用JDK中自带的线程池。

我们可以使用Executors中所提供的**静态**方法来创建线程池

?	static ExecutorService newCachedThreadPool()   创建一个默认的线程池
?	static newFixedThreadPool(int nThreads)	    创建一个指定最多线程数量的线程池 */
public class myThreadPoolDemo1 {
    public static void main(String[] args) throws InterruptedException {

        //1,创建一个默认的线程池对象.池子中默认是空的.默认最多可以容纳int类型的最大值.
        ExecutorService executorService = Executors.newCachedThreadPool();
        //Executors --- 可以帮助我们创建线程池对象
        //ExecutorService --- 可以帮助我们控制线程池

        executorService.submit(()->{ 
            System.out.println(Thread.currentThread().getName() + "在执行了");
        });

        //Thread.sleep(100);
        executorService.submit(()->{ 
            System.out.println(Thread.currentThread().getName() + "在执行了");
        });

        executorService.shutdown();
    }
}
