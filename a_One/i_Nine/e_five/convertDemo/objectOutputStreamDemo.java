package a_One.i_Nine.e_five.convertDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class objectOutputStreamDemo{
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectOutputStream oos = new ObjectOutputStream(new 
        FileOutputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\e_Five\\convertDemo\\test2.txt"));

        Student s = new Student("ÕÅÈý",30);

        oos.writeObject(s);

        ObjectInputStream ois = new ObjectInputStream(new 
        FileInputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\e_Five\\convertDemo\\test2.txt"));

        Object obj = ois.readObject();
        Student stu = (Student)obj;
        System.out.println(stu.getName() + " " + stu.getAge());
        ois.close();
        oos.close();
        
    }
}