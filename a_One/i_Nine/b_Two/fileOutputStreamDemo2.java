package a_One.i_Nine.b_Two;

import java.io.FileOutputStream;
import java.io.IOException;

//�ֽ���д���ݼ��쳣����Ӧ�á�

//�쳣�����ʽ

// try-catch-finally
//   
//     try{
//     	���ܳ����쳣�Ĵ���;
//     }catch(�쳣���� ������){
//     	�쳣�Ĵ������;
//     }finally{
//     	ִ�������������;
//     }

//   - finally�ص�
//    - ��finally���Ƶ����һ����ִ�У�����JVM�˳�

public class fileOutputStreamDemo2 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\b_Two\\test.txt");
            fos.write("Hello World".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if( fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
