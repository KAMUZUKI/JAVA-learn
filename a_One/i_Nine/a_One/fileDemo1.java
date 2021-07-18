package a_One.i_Nine.a_One;

import java.io.File;
import java.io.IOException;

public class fileDemo1 {
    public static void main(String[] args) throws IOException {    
        
        //需求1：我要在E:\\itcast目录下创建一个文件java.txt
        File f1 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\java.txt");
        System.out.println(f1.createNewFile()); 
        System.out.println("--------");

        //需求2：我要在E:\\itcast目录下创建一个目录JavaSE
        File f2 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\JavaSE");
        System.out.println(f2.mkdir());
        System.out.println("--------");

        //需求3：我要在E:\\itcast目录下创建一个多级目录JavaWEB\\HTML
        File f3 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\HTML");
        //System.out.println(f3.mkdir());
        System.out.println(f3.mkdirs());
        System.out.println("--------");

        //需求4：我要在E:\\itcast目录下创建一个文件javase.txt
        File f4 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\javase.txt");
        //System.out.println(f4.mkdir());
        System.out.println(f4.createNewFile());
    }
}
