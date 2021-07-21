package a_One.i_Nine.e_five.propertiesDemo;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Properties;

import a_One.i_Nine.e_five.convertDemo.Student;

/* 
### Properties集合练习【应用】

- 案例需求

  在Properties文件中手动写上姓名和年龄,读取到集合中,将该数据封装成学生对象,写到本地文件

- 实现步骤

  - 创建Properties集合,将本地文件中的数据加载到集合中
  - 获取集合中的键值对数据,封装到学生对象中
  - 创建序列化流对象,将学生对象序列化到本地文件中 */
public class propertiesDemo3 {
    public static void main(String[] args) throws IOException{
        //1.创建Properties集合,将本地文件中的数据加载到集合中
        Properties prop = new Properties();
        FileReader fr = new FileReader("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\e_Five\\propertiesDemo\\test1.txt");
        prop.load(fr);
        fr.close();
        
        //2.获取集合中的键值对数据,封装到学生对象中
        String name = prop.getProperty("name");
        int age = Integer.parseInt(prop.getProperty("age"));
        Student s = new Student(name,age);
        System.out.println(s);
        //3.创建序列化流对象,将学生对象序列化到本地文件中
        ObjectOutputStream oos = new ObjectOutputStream(new 
        FileOutputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\e_Five\\propertiesDemo\\properties.txt"));
        oos.writeObject(s);
        oos.close();
    }
}
