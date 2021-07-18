package a_One.i_Nine.a_One;

import java.io.File;
import java.io.IOException;

public class fileDemo2 {
    public static void main(String[] args) throws IOException {
        //需求1：在当前模块目录下创建java.txt文件
        //System.out.println(f1.createNewFile());
        File f1 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\java.txt");
        System.out.println(f1.createNewFile());

        //需求2：删除当前模块目录下的java.txt文件
        System.out.println(f1.delete());

        //需求3：在当前模块目录下创建itcast目录
        //System.out.println(f2.mkdir());
        File f2 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\itcast");
        System.out.println(f2.mkdirs());
        //需求4：删除当前模块目录下的itcast目录

        System.out.println(f2.delete());
        //需求5：在当前模块下创建一个目录itcast,然后在该目录下创建一个文件java.txt
        File f3 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\itcast");
        System.out.println(f3.mkdir());

        File f4 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\itcast\\java.txt");
        System.out.println(f4.createNewFile());
        //System.out.println(f3.mkdir());
        //System.out.println(f4.createNewFile());

        System.out.println(f4.delete());
        System.out.println(f3.delete());
        //需求6：删除当前模块下的目录itcast
    }
}
