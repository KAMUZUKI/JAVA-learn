package a_One.j_Ten.b_Two;

import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable{
    private int ticket = 100;

    //private Object obj = new Object();
    private ReentrantLock lock= new ReentrantLock();
    @Override
    public synchronized void run() {
        while (true) {
            //synchronized (obj){//����̱߳���ʹ��ͬһ����.
                try {
                    lock.lock();
                    if (ticket <= 0) {
                        break;
                    } else {
                        Thread.sleep(10);
                        ticket--;
                        System.out.println(Thread.currentThread().getName() + "��������" + ticket + "��Ʊ");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            // }
        }
        
    }
    
}