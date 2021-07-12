package a_One.g_Seven.d_Four.Date;

import java.util.Date;

public class myDateDemo {
    public static void main(String[] args) {
        // Date()分配一个 Date对象，并初始化，以便它代表它被分配的时间，精确到毫秒public 
        // Date(long date)分配一个 Date对象，并将其初始化为表示从标准基准时间起指定的毫秒数
        Date date1 = new Date();
        System.out.println(date1);

        Date date2 = new Date(0l);
        System.out.println(date2);
    }
}
