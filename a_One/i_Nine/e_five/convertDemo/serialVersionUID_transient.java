package a_One.i_Nine.e_five.convertDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class serialVersionUID_transient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        read();
    }

    //反序列化
    public static void read() throws IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new 
        FileInputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\e_Five\\convertDemo\\test2.txt"));
        Object obj = ois.readObject();
        Students s = (Students)obj;
        System.out.println(s.getName() + "  " + s.getAge());
        ois.close();
    }
    //序列化
    public static void write() throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new 
        FileOutputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\e_Five\\convertDemo\\test2.txt"));
        Students s = new Students("张三",23);
        oos.writeObject(s);
        oos.close();
    }
    
}
