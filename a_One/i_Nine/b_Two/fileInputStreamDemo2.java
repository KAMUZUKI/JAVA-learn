package a_One.i_Nine.b_Two;

import java.io.FileInputStream;
import java.io.IOException;

/* 
### �ֽ���������(һ�ζ�һ���ֽ���������)��Ӧ�á�

- һ�ζ�һ���ֽ�����ķ���

  - public int read(byte[] b)������������ȡ���b.length���ֽڵ�����
  - ���ص��Ƕ��뻺���������ֽ���,Ҳ����ʵ�ʵĶ�ȡ�ֽڸ��� 
  */
public class fileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //�����ֽ�����������
        FileInputStream fis = new FileInputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\b_Two\\test.txt");  
         
        byte[] byteArr = new byte[1024];//1024����������
        int len;

        while ((len=fis.read(byteArr))!=-1) {
            System.out.println(new String(byteArr,0,len));
        }

        fis.close();
    }
}
