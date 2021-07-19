package a_One.i_Nine.b_Two;

import java.io.FileOutputStream;
import java.io.IOException;

//字节流写数据加异常处理【应用】

//异常处理格式

// try-catch-finally
//   
//     try{
//     	可能出现异常的代码;
//     }catch(异常类名 变量名){
//     	异常的处理代码;
//     }finally{
//     	执行所有清除操作;
//     }

//   - finally特点
//    - 被finally控制的语句一定会执行，除非JVM退出

public class fileOutputStreamDemo2 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\b_Two\\test.txt");
            fos.write("Hello World".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if( fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
