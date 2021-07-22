package a_One.j_Ten.a_One.threadDemo3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* 
### 实现多线程方式三: 实现Callable接口【应用】

+ 方法介绍

  | 方法名                           | 说明                                               |
  | -------------------------------- | -------------------------------------------------- |
  | V call()                         | 计算结果，如果无法计算结果，则抛出一个异常         |
  | FutureTask(Callable<V> callable) | 创建一个 FutureTask，一旦运行就执行给定的 Callable |
  | V get()                          | 如有必要，等待计算完成，然后获取其结果             |

+ 实现步骤

  + 定义一个类MyCallable实现Callable接口
  + 在MyCallable类中重写call()方法
  + 创建MyCallable类的对象
  + 创建Future的实现类FutureTask对象，把MyCallable对象作为构造方法的参数
  + 创建Thread类的对象，把FutureTask对象作为构造方法的参数
  + 启动线程
  + 再调用get方法，就可以获取线程结束之后的结果。 */
public class myCallableDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        myCallable mc = new myCallable();
        FutureTask<String> ft = new FutureTask<>(mc);
        Thread t1 = new Thread(ft);
        t1.start();
        String s = ft.get();
        System.out.println(s);
    }
}
