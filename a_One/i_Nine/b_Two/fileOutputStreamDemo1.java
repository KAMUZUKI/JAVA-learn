package a_One.i_Nine.b_Two;

import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {

        //�����ֽ����������
        FileOutputStream fos = new FileOutputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\b_Two\\test.txt",true);

        //д����
        for (int i = 0; i < 10; i++) {
            fos.write(97);
            fos.write("\r\n".getBytes());
            byte[] byteArr = {97,98,99,100,101,102}; 
            fos.write(byteArr, 1, 5);
            fos.write("\r\n".getBytes());
        }

        //�ͷ���Դ
        fos.close();
    }
}
