package a_One.i_Nine.e_five.convertDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* 
### ת������д���ݡ�Ӧ�á�

+ ���췽��

  | ������                                               | ˵��                                         |
  | --------------------------------------------------- | -------------------------------------------- |
  | InputStreamReader(InputStream in)                   | ʹ��Ĭ���ַ����봴��InputStreamReader����    |
  | InputStreamReader(InputStream in,String chatset)    | ʹ��ָ�����ַ����봴��InputStreamReader����  |
  | OutputStreamWriter(OutputStream out)                | ʹ��Ĭ���ַ����봴��OutputStreamWriter����   |
  | OutputStreamWriter(OutputStream out,String charset) | ʹ��ָ�����ַ����봴��OutputStreamWriter���� | */

public class conversionStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new 
        FileOutputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\e_Five\\convertDemo\\test.txt"),"GBK");
        osw.write("�й�");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new 
        FileInputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\e_Five\\convertDemo\\test.txt"),"GBK");
        int ch;
        while ((ch=isr.read())!=-1) {
            System.out.println((char)ch);
        }
        isr.close();
    }
}
