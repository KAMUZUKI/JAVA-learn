package Scanner;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] agrs){

        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ������ݣ�");
        String line = sc.nextLine();
        System.out.println("���������Ϊ��" + line);
        sc.close();

        String s1 = new String();
        System.out.println("s1:" + s1);

        char[] chs = {'a','b','c'};
        String s2 = new String(chs);
        System.out.println("s2:" + s2);

        byte[] bys = {97,98,99};
        String s3 = new String(bys);
        System.out.println("s3:" + s3);

        String s4 = "abc";
        System.out.println("s4:" + s4);

        //String����������ͬ�ַ���ֻ����        һ����ַ
        String ss1 = "abc";
        String ss2 = "abc";
        System.out.println(ss1==ss2);
    }
}
