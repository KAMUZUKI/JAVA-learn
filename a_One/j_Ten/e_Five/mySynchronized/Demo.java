package a_One.j_Ten.e_Five.mySynchronized;


public class Demo {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();

        t1.setName("小路同学");
        t1.start();
        t2.setName("小刚同学");
        t2.start();
    }
}
