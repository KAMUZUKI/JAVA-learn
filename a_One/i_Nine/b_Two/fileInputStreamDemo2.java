package a_One.i_Nine.b_Two;

import java.io.FileInputStream;
import java.io.IOException;

/* 
### 字节流读数据(一次读一个字节数组数据)【应用】

- 一次读一个字节数组的方法

  - public int read(byte[] b)：从输入流读取最多b.length个字节的数据
  - 返回的是读入缓冲区的总字节数,也就是实际的读取字节个数 
  */
public class fileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\b_Two\\test.txt");  
         
        byte[] byteArr = new byte[1024];//1024及其整数倍
        int len;

        while ((len=fis.read(byteArr))!=-1) {
            System.out.println(new String(byteArr,0,len));
        }

        fis.close();
    }
}
