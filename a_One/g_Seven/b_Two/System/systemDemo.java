package a_One.g_Seven.b_Two.System;

public class systemDemo {
    public static void main(String[] args) {
        // System.out.println(111);
        // System.exit(0);
        // System.out.println(222);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = new int[10];

        // System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        // for (int i = 0; i < arr2.length; i++) {
        //     System.out.println(arr2[i]);
        // }

        System.arraycopy(arr1, 3, arr2, 8, 2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
