package a_One.j_Ten.a_One.threadDemo7;
/* 
### �ػ��̡߳�Ӧ�á�

- ��ط���

  | ������                     | ˵��                                                       |
  | -------------------------- | ---------------------------------------------------------|
  | void setDaemon(boolean on) | �����̱߳��Ϊ�ػ��̣߳������е��̶߳����ػ��߳�ʱ��Java��������˳� |*/

public class threadDemo { 
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();

        t1.setName("Ů��");
        t2.setName("��̥");
        
        //�ѵڶ����߳�����Ϊ�ػ��߳�
        //����ͨ�߳�ִ����֮��,��ô�ػ��߳�Ҳû�м���������ȥ�ı�Ҫ��.
        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
