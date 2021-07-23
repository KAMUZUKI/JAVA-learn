package a_One.j_Ten.c_Three.Blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;

public class foodie extends Thread{
    private ArrayBlockingQueue<String> bd;

    public foodie(ArrayBlockingQueue<String> bd){
        this.bd = bd;
    }

    @Override
    public void run(){
        while (true) {
            try {
                String take = bd.take();
                System.out.println("�Ի���" + take + "�ó�������");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
