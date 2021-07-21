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
     *      ��ȡ���ļ�ĩβ����ֵ�� -1
     *  readLine():
     *      ��ȡ���ļ���ĩβ����ֵ null
     *  readObject():
     *      ��ȡ���ļ���ĩβ ֱ���׳��쳣
     *  ���Ҫ���л��Ķ����ж��,������ֱ�ӽ�����������л����ļ���,��Ϊ�����л�ʱ���׳��쳣
     *      ����: ��Ҫ���л��Ķ������洢��������,Ȼ�󽫼������л����ļ���
    */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // - 1.�����л�������
        ObjectOutputStream oos = new ObjectOutputStream(new 
        FileOutputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\e_Five\\convertDemo\\test3.txt"));
        ArrayList<Student> arrayList = new ArrayList<>();
        
        // - 2.�������ѧ������
        Student s1 = new Student("����", 23);
        Student s2 = new Student("����", 24);
        Student s3 = new Student("����", 25);

        // - 3.��ѧ��������ӵ�������
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        // - 4.�����϶������л����ļ���
        oos.writeObject(arrayList);
        oos.close();

        // - 5.���������л�������
        ObjectInputStream ois = new ObjectInputStream(new 
        FileInputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\e_Five\\convertDemo\\test3.txt"));
        // - 6.���ļ��еĶ�������,��ȡ���ڴ���
        Object obj = ois.readObject();
        
        @SuppressWarnings (value="unchecked")
        ArrayList<Student> arrayList2 = (ArrayList<Student>)obj;
        ois.close();
        for(Student s:arrayList2){
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
