package a_One.i_Nine.b_Two;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileCopyJpgDemo{
    public static void main(String[] args) throws IOException {
        //��������Դ�����ֽ�����������
        FileInputStream fis = new FileInputStream("D:\\��ֽ\\pixies-b.png");
        //����Ŀ�ĵش����ֽ����������
        FileOutputStream fos = new FileOutputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\b_Two\\wallpaper.jpg");

        //��д���ݣ�����ͼƬ(һ�ζ�ȡһ���ֽ����飬һ��д��һ���ֽ�����)
        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1) {
            fos.write(bys,0,len);
        }

        //�ͷ���Դ
        fos.close();
        fis.close();
    }
}