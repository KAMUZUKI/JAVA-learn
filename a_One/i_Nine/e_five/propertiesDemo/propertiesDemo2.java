package a_One.i_Nine.e_five.propertiesDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class propertiesDemo2 {
    public static void main(String[] args) throws IOException {
        //�Ѽ����е����ݱ��浽�ļ�
        myStore();

        //���ļ��е����ݼ��ص�����
        myLoad();
    }

    private static void myStore() throws IOException{
        Properties prop = new Properties();
        prop.setProperty("����", "23");
        prop.setProperty("����", "24");
        prop.setProperty("����", "25");

        FileWriter fw = new FileWriter("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\e_Five\\propertiesDemo\\test1.txt");
        prop.store(fw, null);
        fw.close();
    }

    private static void myLoad() throws IOException{
        Properties prop = new Properties();
        FileReader fr = new FileReader("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\e_Five\\propertiesDemo\\test1.txt");
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }

    
}
