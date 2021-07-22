package a_One.j_Ten.a_One.threadDemo6;

import java.util.concurrent.Callable;

public class myCallable implements Callable<String>{
    @Override
    public String call() throws Exception{
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
        return "线程执行完毕了";
    }
}
