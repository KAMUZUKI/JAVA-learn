package a_One.j_Ten.a_One.threadDemo5;

public class myRunnable implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
