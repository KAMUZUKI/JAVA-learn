package a_One.j_Ten.e_Five.mySynchronized;

public class myThread2 extends Thread{
    @Override
    public void run(){
        synchronized(Money.lock){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Money.money = 90000;
        }
    }
}
