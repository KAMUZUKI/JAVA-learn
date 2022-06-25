import java.util.ArrayList;



public class ArrayListDemo3 {
    public static void main(String[] agrs){
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("李四",24);
        Student stu3 = new Student("王五",25);
        
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "..." + stu.getAge());   
        }
    }
}
