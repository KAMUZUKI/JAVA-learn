package a_One.i_Nine.a_One;

import java.io.File;
import java.io.IOException;

public class fileDemo2 {
    public static void main(String[] args) throws IOException {
        //����1���ڵ�ǰģ��Ŀ¼�´���java.txt�ļ�
        //System.out.println(f1.createNewFile());
        File f1 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\java.txt");
        System.out.println(f1.createNewFile());

        //����2��ɾ����ǰģ��Ŀ¼�µ�java.txt�ļ�
        System.out.println(f1.delete());

        //����3���ڵ�ǰģ��Ŀ¼�´���itcastĿ¼
        //System.out.println(f2.mkdir());
        File f2 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\itcast");
        System.out.println(f2.mkdirs());
        //����4��ɾ����ǰģ��Ŀ¼�µ�itcastĿ¼

        System.out.println(f2.delete());
        //����5���ڵ�ǰģ���´���һ��Ŀ¼itcast,Ȼ���ڸ�Ŀ¼�´���һ���ļ�java.txt
        File f3 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\itcast");
        System.out.println(f3.mkdir());

        File f4 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\itcast\\java.txt");
        System.out.println(f4.createNewFile());
        //System.out.println(f3.mkdir());
        //System.out.println(f4.createNewFile());

        System.out.println(f4.delete());
        System.out.println(f3.delete());
        //����6��ɾ����ǰģ���µ�Ŀ¼itcast
    }
}
