package a_One.j_Ten.b_Two;

public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();    
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("����һ");
        t2.setName("���ڶ�");

        t1.start();
        t2.start();
     }
}
