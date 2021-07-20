package a_One.i_Nine.c_Three;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileBufferStreamDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\c_Three\\嘿嘿嘿.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\c_Three\\copy.avi"));

        //字节缓冲流一次读写一个字节
        int b;
        while ((b=bis.read())!=-1) {
            bos.write(b);
        }

        bos.close();
        bis.close();
        
    }
}
