package a_One.j_Ten.e_Five.ConcurrencyUtilityClass;

import java.util.Hashtable;

public class MyHashtable {
    public static void main(String[] args) throws InterruptedException{
        Hashtable<String,String> ht = new Hashtable<>();

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 25; i++) {
                ht.put(i + "",i + "");
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 25; i < 50; i++) {
                ht.put(i + "",i + "");
            }
        });

        t1.start();
        t2.start();

        System.out.println("==========================");
        Thread.sleep(2000);

        for (int i = 0; i < 51; i++) {
            System.out.println(ht.get(i + ""));
        }
    }
}
