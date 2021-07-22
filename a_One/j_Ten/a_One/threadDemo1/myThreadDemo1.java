package a_One.j_Ten.a_One.threadDemo1;

/* 
### 实现多线程方式一：继承Thread类【应用】

- 方法介绍

  | 方法名       | 说明                                        |
  | ------------ | ------------------------------------------- |
  | void run()   | 在线程开启后，此方法将被调用执行            |
  | void start() | 使此线程开始执行，Java虚拟机会调用run方法() |

- 实现步骤

  - 定义一个类MyThread继承Thread类
  - 在MyThread类中重写run()方法
  - 创建MyThread类的对象
  - 启动线程 */
public class myThreadDemo1 {
    public static void main(String[] args) {
        myThread mt1 = new myThread();
        myThread mt2 = new myThread();
        
        mt1.start();
        mt2.start();
    }
}
