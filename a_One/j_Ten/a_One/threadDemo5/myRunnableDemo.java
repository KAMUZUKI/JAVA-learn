package a_One.j_Ten.a_One.threadDemo5;

public class myRunnableDemo {
    public static void main(String[] args) {
        myRunnable mr = new myRunnable();

        // Thread t1 = new Thread(mr);
        // Thread t2 = new Thread(mr);

        // t1.start();
        // t2.start();

        
        Thread t = new Thread(mr);
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
        
    }
}
