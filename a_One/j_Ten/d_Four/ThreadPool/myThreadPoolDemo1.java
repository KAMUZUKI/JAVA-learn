package a_One.j_Ten.d_Four.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* 
### �̳߳�-ExecutorsĬ���̳߳�

���� : JDK���̳߳�Ҳ��������ص�ʵ�֣�����ʵ��ҵ����������Ҳ����ȥ�Զ����̳߳أ�����ʹ��JDK���Դ����̳߳ء�

���ǿ���ʹ��Executors�����ṩ��**��̬**�����������̳߳�

?	static ExecutorService newCachedThreadPool()   ����һ��Ĭ�ϵ��̳߳�
?	static newFixedThreadPool(int nThreads)	    ����һ��ָ������߳��������̳߳� */
public class myThreadPoolDemo1 {
    public static void main(String[] args) throws InterruptedException {

        //1,����һ��Ĭ�ϵ��̳߳ض���.������Ĭ���ǿյ�.Ĭ������������int���͵����ֵ.
        ExecutorService executorService = Executors.newCachedThreadPool();
        //Executors --- ���԰������Ǵ����̳߳ض���
        //ExecutorService --- ���԰������ǿ����̳߳�

        executorService.submit(()->{ 
            System.out.println(Thread.currentThread().getName() + "��ִ����");
        });

        //Thread.sleep(100);
        executorService.submit(()->{ 
            System.out.println(Thread.currentThread().getName() + "��ִ����");
        });

        executorService.shutdown();
    }
}
