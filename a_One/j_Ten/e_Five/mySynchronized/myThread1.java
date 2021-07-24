package a_One.j_Ten.e_Five.mySynchronized;

public class myThread1 extends Thread{
    @Override
    public void run(){
        while (true) {
            synchronized(Money.lock){
                if ((Money.money != 10000)) {
                    System.out.println("结婚基金已经不是十万了");
                    break;
                }
            }
        }
    }
}
