package a_One.j_Ten.a_One.threadDemo6;
/* 
���ȼ���ط���
| ������                                  | ˵��                                                  |
| --------------------------------------- | ----------------------------------------------------|
| final int getPriority()                 | ���ش��̵߳����ȼ�                                     |
| final void setPriority(int newPriority) | ���Ĵ��̵߳����ȼ��߳�Ĭ�����ȼ���5���߳����ȼ��ķ�Χ�ǣ�1-10 | */
import java.util.concurrent.FutureTask;

public class myCallableDemo {
    public static void main(String[] args) {
        myCallable mc = new myCallable();
        FutureTask<String> ft = new FutureTask<>(mc);
        Thread t1 = new Thread(ft);
        t1.setName("�ɻ�");
        t1.setPriority(10);
        //System.out.println(t1.getPriority());//5
        t1.start();

        myCallable mc2 = new myCallable();
        FutureTask<String> ft2 = new FutureTask<>(mc2);
        Thread t2 = new Thread(ft2);
        t2.setName("̹��");
        t2.setPriority(1);
        //System.out.println(t2.getPriority());//5
        t2.start();
    }
}
