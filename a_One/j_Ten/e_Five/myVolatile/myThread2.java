package a_One.j_Ten.e_Five.myVolatile;

public class myThread2 extends Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Money.money = 90000;
    }
}
