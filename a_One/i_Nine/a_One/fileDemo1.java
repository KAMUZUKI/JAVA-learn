package a_One.i_Nine.a_One;

import java.io.File;
import java.io.IOException;

public class fileDemo1 {
    public static void main(String[] args) throws IOException {    
        
        //����1����Ҫ��E:\\itcastĿ¼�´���һ���ļ�java.txt
        File f1 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\java.txt");
        System.out.println(f1.createNewFile()); 
        System.out.println("--------");

        //����2����Ҫ��E:\\itcastĿ¼�´���һ��Ŀ¼JavaSE
        File f2 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\JavaSE");
        System.out.println(f2.mkdir());
        System.out.println("--------");

        //����3����Ҫ��E:\\itcastĿ¼�´���һ���༶Ŀ¼JavaWEB\\HTML
        File f3 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\HTML");
        //System.out.println(f3.mkdir());
        System.out.println(f3.mkdirs());
        System.out.println("--------");

        //����4����Ҫ��E:\\itcastĿ¼�´���һ���ļ�javase.txt
        File f4 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\javase.txt");
        //System.out.println(f4.mkdir());
        System.out.println(f4.createNewFile());
    }
}
