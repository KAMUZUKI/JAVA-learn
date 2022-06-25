package Student;

class Student{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }
}

public class studentDemo {
    public static void main(String[] agrs)
    {
        Student s = new Student();
        s.setAge(10);
        s.setName("zhangsan");
        int age = s.getAge();
        System.out.println(age);
        String name = s.getName();
        System.out.println(name);
        s.show();
    }
}
