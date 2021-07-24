package a_One.j_Ten.d_Four.ThreadStata;

public class ThreadStateDemo3 {

    public static void main(String[] args) throws InterruptedException {

        //����һ���������������ͽ���
        Object obj2 = new Object();

        //����һ���̣߳�����ռ��obj2�������
        new Thread(() -> {
            synchronized (obj2) {
                try {
                    Thread.sleep(100);              //��һ���߳�Ҫ������100����
                    obj2.wait();                          //Ȼ��ͨ��wait()�������еȴ�״̬�����ͷ�obj2�Ķ�����
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        //����Ŀ���̣߳���ȡ�ȴ���ȡobj2����
        Thread thread = new Thread(() -> {
            System.out.println("2.ִ��thread.start()֮���̵߳�״̬��" + Thread.currentThread().getState());
            synchronized (obj2) {
                try {
                    Thread.sleep(100);              //thread3Ҫ���ж�����100����
                    obj2.notify();                        //Ȼ��ͨ��notify()��������������ojb2�ϵȴ����̼߳���ִ�к�������
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("4.�����������̵߳�״̬��" + Thread.currentThread().getState());
        });

        //��ȡstart()֮ǰ��״̬
        System.out.println("1.ͨ��new��ʼ��һ���̣߳����ǻ�û��thread.start()֮ǰ���̵߳�״̬��" + thread.getState());

        //�����߳�
        thread.start();

        //�ȵ�100����
        Thread.sleep(50);

        //��һ���߳��ͷ���������Ҫ100���룬�����ڵ�50����ʱ��thread������ȴ�obj�Ķ�����������
        System.out.println("3.��Ϊ�ȴ���������ʱ���̵߳�״̬��" + thread.getState());

        //�ٵ�300����
        Thread.sleep(300);

        //�����̵߳�ִ��ʱ�����֮ǰ�ȴ���50�����ܹ���250���룬���Ե�300���룬���е��̶߳��Ѿ�ִ�����
        System.out.println("5.�߳�ִ�����֮���̵߳�״̬��" + thread.getState());

    }

}
