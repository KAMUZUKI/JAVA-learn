package a_One.j_Ten.a_One.threadDemo7;
/* 
### 守护线程【应用】

- 相关方法

  | 方法名                     | 说明                                                       |
  | -------------------------- | ---------------------------------------------------------|
  | void setDaemon(boolean on) | 将此线程标记为守护线程，当运行的线程都是守护线程时，Java虚拟机将退出 |*/

public class threadDemo { 
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();

        t1.setName("女神");
        t2.setName("备胎");
        
        //把第二个线程设置为守护线程
        //当普通线程执行完之后,那么守护线程也没有继续运行下去的必要了.
        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
