package a_One.j_Ten.a_One.threadDemo7;

public class myThread2 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}