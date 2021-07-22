package a_One.j_Ten.a_One.threadDemo1;

public class myThread extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("线程执行 " + i + " 次");
        }
    }
}
