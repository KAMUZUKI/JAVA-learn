package a_One.g_Seven.d_Four.Date;
import java.util.Date;

public class myDateDemo2 {
    public static void main(String[] args) {
        //�������ڶ���
        Date d = new Date();

        //public long getTime():��ȡ�������ڶ����1970��1��1�� 00:00:00�����ڵĺ���ֵ
        System.out.println(d.getTime());
        //        System.out.println(d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "��");

        //public void setTime(long time):����ʱ�䣬�����Ǻ���ֵ
        //        long time = 1000*60*60;
        long time = System.currentTimeMillis();
        d.setTime(time);

        System.out.println(d);
    }
}
