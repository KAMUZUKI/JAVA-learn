package a_One.i_Nine.a_One;

import java.io.File;
import java.io.IOException;

// ### 1.7File����ϰ����Ӧ�á�
// + ��������
//   ɾ��һ���༶�ļ���

// + ʵ�ֲ���
//   + ����һ������,����һ��File����
//   + �������File����,��ȡ���±ߵ�ÿ���ļ����ļ��ж���
//   + �жϵ�ǰ��������File�������ļ������ļ���
//   + ������ļ�,ֱ��ɾ��
//   + ������ļ���,�ݹ�����Լ�,����ǰ��������File��������������
//   + �������ݹ������ļ���File�����Ѿ��������,���ֱ��ɾ��������ļ���

public class fileTestDemo2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\test");
        // f1.mkdirs();
        // File f2 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\test\\test1.txt");
        // f2.createNewFile();
        // File f3 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\test\\test2.txt");
        // f3.createNewFile();
        deleteDir(f1);
        
    }

    public static void deleteDir(File f1){
        File[] fileArray = f1.listFiles();
        for(File file:fileArray){
            if (file.isFile()) {
                file.delete();
            } else {
                deleteDir(file);
            }
        }
    }
}
