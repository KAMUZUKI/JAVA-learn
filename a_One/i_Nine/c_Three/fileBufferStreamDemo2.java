package a_One.i_Nine.c_Three;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileBufferStreamDemo2 {
    public static void main(String[] args) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\c_Three\\�ٺٺ�.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\c_Three\\copy.avi"));

        //�ֽڻ�����һ�ζ�дһ���ֽ�����
        byte[] bytes = new byte[1024];
        int len;
        while ((len=bis.read(bytes))!=-1) {
            bos.write(bytes,0,len);
        }

        bis.close();
        bos.close();
    }
}
