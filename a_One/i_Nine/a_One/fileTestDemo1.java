package a_One.i_Nine.a_One;

import java.io.File;
import java.io.IOException;

// ### 1.6File����ϰһ��Ӧ�á�
// + ��������
//   �ڵ�ǰģ���µ�aaa�ļ����д���һ��a.txt�ļ�

// + ʵ�ֲ���
//   + ����File����,ָ��aaa�ļ���
//   + �ж�aaa�ļ����Ƿ����,����������򴴽�
//   + ����File����,ָ��aaa�ļ����µ�a.txt�ļ�
//   + ��������ļ�
public class fileTestDemo1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\aaa");
        f1.mkdirs();
        //ע���:�ļ����ڵ��ļ��б���Ҫ����.
        
        File f2 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\aaa\\a.txt");
        f2.createNewFile();

        File file = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\aaa");
        if(file.exists()){
            file.mkdirs();
        }

        File newFile = new File(file, "a.txt");
        newFile.createNewFile();
    }
}
