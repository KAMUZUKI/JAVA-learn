package a_One.i_Nine.d_Four;

import java.io.FileWriter;
import java.io.IOException;

/* 
成员方法

| 方法名                                    | 说明                 |
| ----------------------------------------- | -------------------- |
| void   write(int c)                       | 写一个字符           |
| void   write(char[] cbuf)                 | 写入一个字符数组     |
| void write(char[] cbuf, int off, int len) | 写入字符数组的一部分  |
| void write(String str)                    | 写一个字符串        |
| void write(String str, int off, int len)  | 写一个字符串的一部分 | 
*/
public class charStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\JAVA_PROGRAM\\a_One\\i_Nine\\d_Four\\test.txt");
        fw.write(97);
        fw.write("\r\n");
        fw.flush();
        
        char[] chars = {97,98,99,100,101};
        fw.write(chars);
        fw.write("\r\n");
        
        fw.write(chars, 0, 3);
        fw.write("\r\n");
        
        String str = "abcdef";
        fw.write(str);
        fw.write("\r\n");

        fw.write(str, 1, 3);
        fw.write("\r\n");
        fw.close();
    }
}
