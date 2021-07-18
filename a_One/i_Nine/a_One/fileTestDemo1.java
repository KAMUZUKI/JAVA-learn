package a_One.i_Nine.a_One;

import java.io.File;
import java.io.IOException;

// ### 1.6File类练习一【应用】
// + 案例需求
//   在当前模块下的aaa文件夹中创建一个a.txt文件

// + 实现步骤
//   + 创建File对象,指向aaa文件夹
//   + 判断aaa文件夹是否存在,如果不存在则创建
//   + 创建File对象,指向aaa文件夹下的a.txt文件
//   + 创建这个文件
public class fileTestDemo1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\aaa");
        f1.mkdirs();
        //注意点:文件所在的文件夹必须要存在.
        
        File f2 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\aaa\\a.txt");
        f2.createNewFile();

        File file = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\aaa");
        if(file.exists()){
            file.mkdirs();
        }

        File newFile = new File(file, "a.txt");
        newFile.createNewFile();
    }
}
