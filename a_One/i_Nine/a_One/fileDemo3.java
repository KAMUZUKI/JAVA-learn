package a_One.i_Nine.a_One;

import java.io.File;

public class fileDemo3 {
    public static void main(String[] args) {
        //����һ��File����
        File f1 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\java.txt");
        
        //public boolean isDirectory()�����Դ˳���·������ʾ��File�Ƿ�ΪĿ¼
        //public boolean isFile()�����Դ˳���·������ʾ��File�Ƿ�Ϊ�ļ�
        //public boolean exists()�����Դ˳���·������ʾ��File�Ƿ����
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

        //public String getAbsolutePath()�����ش˳���·�����ľ���·�����ַ���
        //public String getPath()�����˳���·����ת��Ϊ·�����ַ���
        //public String getName()�������ɴ˳���·������ʾ���ļ���Ŀ¼������
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());
        System.out.println(f1.delete());
        System.out.println("-------------");
        //public File[] listFiles()�����ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��File��������

        File f2 = new File("D:\\");
        File[] fileArray = f2.listFiles(); 
        for(File file:fileArray ){
            if(file.isFile()){
                System.out.println(file.getName());
            }
        }
        //System.out.println(file);
        //System.out.println(file.getName());

    }
}
