package a_One.j_Ten.d_Four.ThreadStata;

public class ThreadStateDemo1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread =new Thread(()->{
            System.out.println("2.ִ��thread.start()֮���̵߳�״̬��" + Thread.currentThread().getState());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("4.ִ��Thread.sleep(long)���֮���̵߳�״̬��" + Thread.currentThread().getState());
        });

        //��ȡstart()֮ǰ��״̬
        System.out.println("1.ͨ��new��ʼ��һ���̣߳����ǻ�û��start()֮ǰ���̵߳�״̬��" + thread.getState());

        //�����߳�
        thread.start();
        //����50����
        Thread.sleep(50);

        //��Ϊthread1��Ҫ����100���룬�����ڵ�50���룬thread����sleep״̬
        System.out.println("3.ִ��Thread.sleep(long)ʱ���̵߳�״̬��" + thread.getState());

        //thread1��main�߳���������150���룬�����ڵ�150����,thread����ִ�����
        Thread.sleep(100);

        System.out.println("5.�߳�ִ�����֮���̵߳�״̬��" + thread.getState() + "\n");
    }
}
