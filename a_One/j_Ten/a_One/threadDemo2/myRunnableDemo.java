package a_One.j_Ten.a_One.threadDemo2;

/* 
### ʵ�ֶ��̷߳�ʽ����ʵ��Runnable�ӿڡ�Ӧ�á�

- Thread���췽��

  | ������                               | ˵��                   |
  | ------------------------------------ | ---------------------- |
  | Thread(Runnable target)              | ����һ���µ�Thread���� |
  | Thread(Runnable target, String name) | ����һ���µ�Thread���� |

- ʵ�ֲ���

  - ����һ����MyRunnableʵ��Runnable�ӿ�
  - ��MyRunnable������дrun()����
  - ����MyRunnable��Ķ���
  - ����Thread��Ķ��󣬰�MyRunnable������Ϊ���췽���Ĳ���
  - �����߳� */
public class myRunnableDemo {
    public static void main(String[] args) {
        myRunnable mr = new myRunnable();

        Thread t1 = new Thread(mr,"�ɻ�");
        Thread t2 = new Thread(mr,"̹��");
        t1.start();
        t2.start();
    }
}
