package a_One.j_Ten.a_One.threadDemo2;

public class myRunnable implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
