package a_One.j_Ten.c_Three.Blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;

public class cooker extends Thread{
    private ArrayBlockingQueue<String> bd; 

    public cooker(ArrayBlockingQueue<String> bd) {
        this.bd = bd;
    }

    @Override
    public void run(){
        while (true) {
            try {
                bd.put("������");
                System.out.println("��ʦ����һ��������");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
