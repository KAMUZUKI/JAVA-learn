package a_One.i_Nine.a_One;

import java.io.File;

public class fileDemo3 {
    public static void main(String[] args) {
        //创建一个File对象
        File f1 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\java.txt");
        
        //public boolean isDirectory()：测试此抽象路径名表示的File是否为目录
        //public boolean isFile()：测试此抽象路径名表示的File是否为文件
        //public boolean exists()：测试此抽象路径名表示的File是否存在
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

        //public String getAbsolutePath()：返回此抽象路径名的绝对路径名字符串
        //public String getPath()：将此抽象路径名转换为路径名字符串
        //public String getName()：返回由此抽象路径名表示的文件或目录的名称
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());
        System.out.println(f1.delete());
        System.out.println("-------------");
        //public File[] listFiles()：返回此抽象路径名表示的目录中的文件和目录的File对象数组

        File f2 = new File("D:\\");
        File[] fileArray = f2.listFiles(); 
        for(File file:fileArray ){
            if(file.isFile()){
                System.out.println(file.getName());
            }
        }
        //System.out.println(file);
        //System.out.println(file.getName());

    }
}
