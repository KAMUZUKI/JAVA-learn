package a_One.i_Nine.b_Two;

import java.io.FileInputStream;
import java.io.IOException;

/* 
### 字节流读数据(一次读一个字节数据)【应用】

- 字节输入流
  - FileInputStream(String name)：通过打开与实际文件的连接来创建一个FileInputStream,该文件由文件系统中的路径名name命名

- 字节输入流读取数据的步骤
  - 创建字节输入流对象
  - 调用字节输入流对象的读数据方法
  - 释放资源 
*/
public class fileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\b_Two\\test.txt");
        /*
            fis.read()：读数据
            by=fis.read()：把读取到的数据赋值给by
            by != -1：判断读取到的数据是否是-1
         */
        int by;
        while ((by=fis.read())!=-1) {
            System.out.println((char)by);
        }
    }
}
