package a_One.g_Seven.d_Four.Date;

import java.util.Date;

public class myDateDemo {
    public static void main(String[] args) {
        // Date()����һ�� Date���󣬲���ʼ�����Ա����������������ʱ�䣬��ȷ������public 
        // Date(long date)����һ�� Date���󣬲������ʼ��Ϊ��ʾ�ӱ�׼��׼ʱ����ָ���ĺ�����
        Date date1 = new Date();
        System.out.println(date1);

        Date date2 = new Date(0l);
        System.out.println(date2);
    }
}
