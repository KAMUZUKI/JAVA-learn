package a_One.j_Ten.c_Three.Blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;


public class Demo {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> bd = new ArrayBlockingQueue<>(1);

        foodie f = new foodie(bd);
        cooker c = new cooker(bd);

        f.start();
        c.start();
    }
}
