package a_One.j_Ten.a_One.threadDemo1;

/* 
### ʵ�ֶ��̷߳�ʽһ���̳�Thread�ࡾӦ�á�

- ��������

  | ������       | ˵��                                        |
  | ------------ | ------------------------------------------- |
  | void run()   | ���߳̿����󣬴˷�����������ִ��            |
  | void start() | ʹ���߳̿�ʼִ�У�Java����������run����() |

- ʵ�ֲ���

  - ����һ����MyThread�̳�Thread��
  - ��MyThread������дrun()����
  - ����MyThread��Ķ���
  - �����߳� */
public class myThreadDemo1 {
    public static void main(String[] args) {
        myThread mt1 = new myThread();
        myThread mt2 = new myThread();
        
        mt1.start();
        mt2.start();
    }
}
