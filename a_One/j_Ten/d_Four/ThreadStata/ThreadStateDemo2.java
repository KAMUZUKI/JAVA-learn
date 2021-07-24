package a_One.j_Ten.d_Four.ThreadStata;

public class ThreadStateDemo2 {

    public static void main(String[] args) throws InterruptedException {

        //����һ���������������ͽ���
        Object obj = new Object();

        //����һ���ڲ��߳�
        Thread thread1 = new Thread(() -> {
            System.out.println("2.ִ��thread.start()֮���̵߳�״̬��" + Thread.currentThread().getState());
            synchronized (obj) {
                try {

                    //thread1��Ҫ����100����
                    Thread.sleep(100);

                    //thread1100����֮��ͨ��wait()�����ͷ�obj��������
                    obj.wait();
                    
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("4.��object.notify()��������֮���̵߳�״̬��" + Thread.currentThread().getState());
        });

        //��ȡstart()֮ǰ��״̬
        System.out.println("1.ͨ��new��ʼ��һ���̣߳����ǻ�û��start()֮ǰ���̵߳�״̬��" + thread1.getState());

        //�����߳�
        thread1.start();

        //main�߳�����150����
        Thread.sleep(150);

        //��Ϊthread1�ڵ�100�������wait�ȴ�״̬�����Ե�150��϶����Ի�ȡ��״̬
        System.out.println("3.ִ��object.wait()ʱ���̵߳�״̬��" + thread1.getState());

        //������һ���߳̽��н���
        new Thread(() -> {
            synchronized (obj) {
                //���ѵȴ����߳�
                obj.notify();
            }
        }).start();

        //main�߳�����10����ȴ�thread1�߳��ܹ�����
        Thread.sleep(10);

        //��ȡthread1���н���֮���״̬
        System.out.println("5.�߳�ִ�����֮���̵߳�״̬��" + thread1.getState() + "\n");

    }

}
