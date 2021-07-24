package a_One.j_Ten.e_Five.myVolatile;

public class myThread1 extends Thread{
    @Override
    public void run(){
        while (Money.money == 100000) {
            
        }

        System.out.println("结婚基金已经不是十万了");
    }
}
