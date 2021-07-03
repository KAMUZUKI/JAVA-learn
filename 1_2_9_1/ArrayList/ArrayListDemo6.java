import java.util.ArrayList;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三",10);
        Student stu2 = new Student("李四",20);
        Student stu3 = new Student("王五",30);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        ArrayList<Student> newList = getList(list);
        for (int i = 0; i < newList.size(); i++) {
            Student stu = newList.get(i);
            System.out.println(stu.getName() + "..." + stu.getAge());
        }
        
    }
    
    public static ArrayList<Student> getList(ArrayList<Student> list){
        ArrayList<Student> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            int age = stu.getAge();
            if(age > 18)
            {
                newList.add(stu);
            }
        }
        return newList;
    }
}



