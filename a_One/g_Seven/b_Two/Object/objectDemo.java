package a_One.g_Seven.b_Two.Object;

class Student extends Object {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //this -- s1
        //o -- s2
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o; //student -- s2

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }
}

public class objectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("����ϼ");
        s.setAge(30);
        System.out.println(s); 
        System.out.println(s.toString()); 

        Student s1 = new Student();
        s1.setName("����ϼ");
        s1.setAge(30);

        Student s2 = new Student();
        s2.setName("����ϼ");
        s2.setAge(30);

        //���󣺱Ƚ���������������Ƿ���ͬ
        System.out.println(s1.equals(s2));
    }
}
