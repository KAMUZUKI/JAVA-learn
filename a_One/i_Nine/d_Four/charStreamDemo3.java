package a_One.i_Nine.d_Four;

import java.io.FileReader;
import java.io.IOException;

public class charStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\d_Four\\test.txt");

        //int read()：一次读一个字符数据
        // int ch;
        // while ((ch=fr.read())!=-1) {
        //     System.out.println((char)ch);
        // }
        
        //int read(char[] cbuf)：一次读一个字符数组数据
        char[] chars = new char[1024];
        int len;
        while ((len=fr.read(chars))!=-1) {
            System.out.println(new String(chars,0,len));
        }
        fr.close();
    }
}
