package a_One.i_Nine.b_Two;

import java.io.FileInputStream;
import java.io.IOException;

/* 
### �ֽ���������(һ�ζ�һ���ֽ�����)��Ӧ�á�

- �ֽ�������
  - FileInputStream(String name)��ͨ������ʵ���ļ�������������һ��FileInputStream,���ļ����ļ�ϵͳ�е�·����name����

- �ֽ���������ȡ���ݵĲ���
  - �����ֽ�����������
  - �����ֽ�����������Ķ����ݷ���
  - �ͷ���Դ 
*/
public class fileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\b_Two\\test.txt");
        /*
            fis.read()��������
            by=fis.read()���Ѷ�ȡ�������ݸ�ֵ��by
            by != -1���ж϶�ȡ���������Ƿ���-1
         */
        int by;
        while ((by=fis.read())!=-1) {
            System.out.println((char)by);
        }
    }
}
