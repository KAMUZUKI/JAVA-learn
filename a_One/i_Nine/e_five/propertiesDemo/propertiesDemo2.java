package a_One.i_Nine.e_five.propertiesDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class propertiesDemo2 {
    public static void main(String[] args) throws IOException {
        //把集合中的数据保存到文件
        myStore();

        //把文件中的数据加载到集合
        myLoad();
    }

    private static void myStore() throws IOException{
        Properties prop = new Properties();
        prop.setProperty("张三", "23");
        prop.setProperty("李四", "24");
        prop.setProperty("王五", "25");

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
