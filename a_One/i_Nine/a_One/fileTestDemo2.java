package a_One.i_Nine.a_One;

import java.io.File;
import java.io.IOException;

// ### 1.7File类练习二【应用】
// + 案例需求
//   删除一个多级文件夹

// + 实现步骤
//   + 定义一个方法,接收一个File对象
//   + 遍历这个File对象,获取它下边的每个文件和文件夹对象
//   + 判断当前遍历到的File对象是文件还是文件夹
//   + 如果是文件,直接删除
//   + 如果是文件夹,递归调用自己,将当前遍历到的File对象当做参数传递
//   + 参数传递过来的文件夹File对象已经处理完成,最后直接删除这个空文件夹

public class fileTestDemo2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\test");
        // f1.mkdirs();
        // File f2 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\test\\test1.txt");
        // f2.createNewFile();
        // File f3 = new File("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\a_One\\test\\test2.txt");
        // f3.createNewFile();
        deleteDir(f1);
        
    }

    public static void deleteDir(File f1){
        File[] fileArray = f1.listFiles();
        for(File file:fileArray){
            if (file.isFile()) {
                file.delete();
            } else {
                deleteDir(file);
            }
        }
    }
}
