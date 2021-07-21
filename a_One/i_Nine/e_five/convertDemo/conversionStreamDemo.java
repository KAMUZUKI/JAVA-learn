package a_One.i_Nine.e_five.convertDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* 
### 转换流读写数据【应用】

+ 构造方法

  | 方法名                                               | 说明                                         |
  | --------------------------------------------------- | -------------------------------------------- |
  | InputStreamReader(InputStream in)                   | 使用默认字符编码创建InputStreamReader对象    |
  | InputStreamReader(InputStream in,String chatset)    | 使用指定的字符编码创建InputStreamReader对象  |
  | OutputStreamWriter(OutputStream out)                | 使用默认字符编码创建OutputStreamWriter对象   |
  | OutputStreamWriter(OutputStream out,String charset) | 使用指定的字符编码创建OutputStreamWriter对象 | */

public class conversionStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new 
        FileOutputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\e_Five\\convertDemo\\test.txt"),"GBK");
        osw.write("中国");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new 
        FileInputStream("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\e_Five\\convertDemo\\test.txt"),"GBK");
        int ch;
        while ((ch=isr.read())!=-1) {
            System.out.println((char)ch);
        }
        isr.close();
    }
}
