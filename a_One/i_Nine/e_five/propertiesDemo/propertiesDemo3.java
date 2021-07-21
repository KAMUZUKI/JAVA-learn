package a_One.i_Nine.e_five.propertiesDemo;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Properties;

import a_One.i_Nine.e_five.convertDemo.Student;

/* 
### Properties������ϰ��Ӧ�á�

- ��������

  ��Properties�ļ����ֶ�д������������,��ȡ��������,�������ݷ�װ��ѧ������,д�������ļ�

- ʵ�ֲ���

  - ����Properties����,�������ļ��е����ݼ��ص�������
  - ��ȡ�����еļ�ֵ������,��װ��ѧ��������
  - �������л�������,��ѧ���������л��������ļ��� */
public class propertiesDemo3 {
    public static void main(String[] args) throws IOException{
        //1.����Properties����,�������ļ��е����ݼ��ص�������
        Properties prop = new Properties();
        FileReader fr = new FileReader("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\e_Five\\propertiesDemo\\test1.txt");
        prop.load(fr);
        fr.close();
        
        //2.��ȡ�����еļ�ֵ������,��װ��ѧ��������
        String name = prop.getProperty("name");
        int age = Integer.parseInt(prop.getProperty("age"));
        Student s = new Student(name,age);
        System.out.println(s);
        //3.�������л�������,��ѧ���������л��������ļ���
        ObjectOutputStream oos = new ObjectOutputStream(new 
        FileOutputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\e_Five\\propertiesDemo\\properties.txt"));
        oos.writeObject(s);
        oos.close();
    }
}
