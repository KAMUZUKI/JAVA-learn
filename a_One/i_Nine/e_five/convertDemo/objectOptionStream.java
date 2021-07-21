package a_One.i_Nine.e_five.convertDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class objectOptionStream {
    /*
     *  read():
     *      读取到文件末尾返回值是 -1
     *  readLine():
     *      读取到文件的末尾返回值 null
     *  readObject():
     *      读取到文件的末尾 直接抛出异常
     *  如果要序列化的对象有多个,不建议直接将多个对象序列化到文件中,因为反序列化时容易出异常
     *      建议: 将要序列化的多个对象存储到集合中,然后将集合序列化到文件中
    */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // - 1.建序列化流对象
        ObjectOutputStream oos = new ObjectOutputStream(new 
        FileOutputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\e_Five\\convertDemo\\test3.txt"));
        ArrayList<Student> arrayList = new ArrayList<>();
        
        // - 2.创建多个学生对象
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);

        // - 3.将学生对象添加到集合中
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        // - 4.将集合对象序列化到文件中
        oos.writeObject(arrayList);
        oos.close();

        // - 5.创建反序列化流对象
        ObjectInputStream ois = new ObjectInputStream(new 
        FileInputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\e_Five\\convertDemo\\test3.txt"));
        // - 6.将文件中的对象数据,读取到内存中
        Object obj = ois.readObject();
        
        @SuppressWarnings (value="unchecked")
        ArrayList<Student> arrayList2 = (ArrayList<Student>)obj;
        ois.close();
        for(Student s:arrayList2){
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
