package a_One.i_Nine.b_Two;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileCopyTxtDemo1 {
    public static void main(String[] args) throws IOException {
        //��������Դ�����ֽ�����������
        FileInputStream fis = new FileInputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\b_Two\\test.txt");
        //����Ŀ�ĵش����ֽ����������
        FileOutputStream fos = new FileOutputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\b_Two\\copyTest.txt");

        //��д���ݣ������ı��ļ�(һ�ζ�ȡһ���ֽڣ�һ��д��һ���ֽ�)
        int by;
        while ((by=fis.read())!=-1) {
            fos.write(by);
        }

        //�ͷ���Դ
        fis.close();
        fos.close();
    }
}
