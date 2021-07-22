package a_One.j_Ten.a_One.threadDemo2;

/* 
### 实现多线程方式二：实现Runnable接口【应用】

- Thread构造方法

  | 方法名                               | 说明                   |
  | ------------------------------------ | ---------------------- |
  | Thread(Runnable target)              | 分配一个新的Thread对象 |
  | Thread(Runnable target, String name) | 分配一个新的Thread对象 |

- 实现步骤

  - 定义一个类MyRunnable实现Runnable接口
  - 在MyRunnable类中重写run()方法
  - 创建MyRunnable类的对象
  - 创建Thread类的对象，把MyRunnable对象作为构造方法的参数
  - 启动线程 */
public class myRunnableDemo {
    public static void main(String[] args) {
        myRunnable mr = new myRunnable();

        Thread t1 = new Thread(mr,"飞机");
        Thread t2 = new Thread(mr,"坦克");
        t1.start();
        t2.start();
    }
}
