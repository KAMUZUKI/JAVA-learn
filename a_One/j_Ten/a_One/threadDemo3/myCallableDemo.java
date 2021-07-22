package a_One.j_Ten.a_One.threadDemo3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* 
### ʵ�ֶ��̷߳�ʽ��: ʵ��Callable�ӿڡ�Ӧ�á�

+ ��������

  | ������                           | ˵��                                               |
  | -------------------------------- | -------------------------------------------------- |
  | V call()                         | ������������޷������������׳�һ���쳣         |
  | FutureTask(Callable<V> callable) | ����һ�� FutureTask��һ�����о�ִ�и����� Callable |
  | V get()                          | ���б�Ҫ���ȴ�������ɣ�Ȼ���ȡ����             |

+ ʵ�ֲ���

  + ����һ����MyCallableʵ��Callable�ӿ�
  + ��MyCallable������дcall()����
  + ����MyCallable��Ķ���
  + ����Future��ʵ����FutureTask���󣬰�MyCallable������Ϊ���췽���Ĳ���
  + ����Thread��Ķ��󣬰�FutureTask������Ϊ���췽���Ĳ���
  + �����߳�
  + �ٵ���get�������Ϳ��Ի�ȡ�߳̽���֮��Ľ���� */
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
