package a_One.g_Seven.d_Four.Date;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class simpleDateDemo {
    public static void main(String[] args) throws ParseException {
        //��ʽ������ Date �� String
        Date d = new Date(0);
//        SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);
        System.out.println("--------");

        //�� String �� Date
        String ss = "2048-08-09 11:11:11";
        //ParseException
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = (Date) sdf2.parse(ss);
        System.out.println(dd);
    }
}
